package io.github.ramenfighter03.FirstPlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class FirstPlugin extends JavaPlugin implements Listener {

//Executed method when the plugin is enabled on start or on reload.
	   @Override
	    public void onEnable() {
		   PluginManager pm = Bukkit.getPluginManager();
	        pm.registerEvents(this, this); }
	   
		   
	   @EventHandler
	   public void onPlayerJoin(PlayerJoinEvent event){
		   
		   {
		        Player p = event.getPlayer();
		        if (!p.isOp())
		        {
		            return;
		        }
		   
	      
	        if (p instanceof Player){
	        	Location location = p.getLocation();
	        	 p.getPlayer().getWorld().playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100, 1);
	        	 p.sendMessage(ChatColor.GREEN + "Welcome to TRIVIUM MC! For any assistance or help ");
	        	 p.sendMessage(ChatColor.GREEN + "visit our forums or contact a staff member!");
	        	 p.sendMessage(ChatColor.GREEN + "http://triviummc.boards.net");
	        }
		   }
	        
		   }
		   
		   public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]){
			   if (commandLabel.equalsIgnoreCase("forums")) {
				   Player p = (Player) sender;
				   p.sendMessage(ChatColor.GREEN + "The link to our forums is:");
				   p.sendMessage(ChatColor.GREEN + "http://triviummc.boards.net");
				   
			   }
			   
			   
			   
			   return false;
		   
		   }
		   
		  

 //Executed method when the plugin is disabled on /reload or server shut down.
	   @Override
	    public void onDisable() {

	    }


}

