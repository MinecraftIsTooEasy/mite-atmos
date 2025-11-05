package eu.ha3.matmos.game.data;

import net.minecraft.Entity;
import net.minecraft.EntityLivingBase;
import net.minecraft.EntityClientPlayerMP;
import net.minecraft.FoodStats;
import net.minecraft.Minecraft;
import net.minecraft.SoundManager;
import net.minecraft.SoundPool;
import net.minecraft.World;
import net.minecraft.WorldInfo;
import eu.ha3.mc.haddon.PrivateAccessException;
import eu.ha3.mc.haddon.Utility;
import eu.ha3.mc.haddon.implem.HaddonUtilitySingleton;

/*
            DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE 
                    Version 2, December 2004 

 Copyright (C) 2004 Sam Hocevar <sam@hocevar.net> 

 Everyone is permitted to copy and distribute verbatim or modified 
 copies of this license document, and changing it is allowed as long 
 as the name is changed. 

            DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE 
   TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION 

  0. You just DO WHAT THE FUCK YOU WANT TO. 
*/

public class MAtAccessors
{
	public static FoodStats getFoodStatsOf(EntityClientPlayerMP player)
	{
		return player.getFoodStats();
	}
	
	public static boolean getIsJumpingOf(Utility util, EntityClientPlayerMP player)
	{
		return player.isJumping;
	}
	
	public static boolean getIsInWebOf(Utility util, EntityClientPlayerMP player)
	{
		return player.isInWeb;
	}
	
	public static WorldInfo getWorldInfoOf(World world)
	{
		return world.getWorldInfo();
	}
	
	public static SoundPool getSoundPoolSounds(Utility util)
	{
		return Minecraft.getMinecraft().sndManager.soundPoolSounds;
	}
}
