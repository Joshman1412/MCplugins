package me.josh.BreadEffect.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import Items.ItemManager;

public class Commands implements CommandExecutor { 
	
	
	
	@override
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!sender instanceof Player) {
			sender.sendMessage("Only players can use that command");
			return true;
		}
		Player player = (Player) sender;
		if (cmd.getName().equalsIgnoreCase(anotherString "giveSpeedBread")) {
			player.getInventory().addItem(ItemManager.Speedbread);
		}
		
		return true;
	}	