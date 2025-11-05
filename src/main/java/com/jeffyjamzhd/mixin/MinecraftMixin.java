package com.jeffyjamzhd.mixin;

import com.jeffyjamzhd.MiTEAtmos;
import eu.ha3.matmos.game.system.MAtMod;
import com.jeffyjamzhd.shim.PortUtil;
import net.minecraft.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MinecraftMixin {
    @Shadow
    public boolean isGamePaused;
    @Shadow
    public long prevFrameTime;

    @Inject(method = "runGameLoop", at = @At("TAIL"))
    private void init(CallbackInfo ci) {
        // Initialize (if needed)
        Minecraft mc = (Minecraft) (Object) this;
        if (!MiTEAtmos.mod_instance.isLoaded())
            MiTEAtmos.mod_instance.onInitCompleted(mc);
    }

    @Inject(method = "runTick", at = @At("TAIL"))
    private void updateInput(CallbackInfo ci) {
        MAtMod addon = (MAtMod) MiTEAtmos.mod_instance.getAddon();
        if (addon.isReady()) {
            // Handle input
            addon.userControl.onTick();

            // Update tick
            Minecraft mc = (Minecraft) (Object) this;
            boolean inGame = PortUtil.isInGame(mc);
            MiTEAtmos.mod_instance.onTick(mc, this.prevFrameTime, inGame, !isGamePaused);
        }
    }
}
