package firstAttempt.NMSUtils;

import com.mojang.authlib.GameProfile;

import org.bukkit.craftbukkit.v1_15_R1.entity.CraftEntity;
import org.bukkit.craftbukkit.v1_15_R1.entity.CraftPlayer;

import net.minecraft.server.v1_15_R1.EntityPlayer;
import net.minecraft.server.v1_15_R1.MinecraftServer;
import net.minecraft.server.v1_15_R1.PlayerInteractManager;
import net.minecraft.server.v1_15_R1.WorldServer;

public class DummyEntityPlayer extends EntityPlayer {
	
	public DummyEntityPlayer(MinecraftServer minecraftserver, WorldServer worldserver, GameProfile gameprofile,
			PlayerInteractManager playerinteractmanager) {
		super(minecraftserver, worldserver, gameprofile, playerinteractmanager);
	}
	
	@Override
	public DummyCraftPlayer getBukkitEntity() {
		// CraftEntity bukkitEntity = super.getBukkitEntity();
		
		// if (bukkitEntity == null) {
        //     bukkitEntity = new DummyCraftPlayer(server.server, (EntityPlayer) this);
        // }
		
		// return (DummyCraftPlayer)((CraftPlayer) bukkitEntity);

		return new DummyCraftPlayer(server.server, (EntityPlayer) this);
	}
}
