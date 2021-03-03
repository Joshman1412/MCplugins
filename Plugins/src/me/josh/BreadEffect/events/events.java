package me.josh.BreadEffect.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import Items.ItemManager;

public class events implements listener {
	
	@EventHandler
	public static void on rightclick(PlayerInteractEvent event) {
		if (event.getAction() == Action.RIGHT_CLICK_AIR) {
			if (event.getItem() != null) {
				if (event.getItem().getItemMeta().equals(ItemManager.Speedbread.getItemMeta())) {
					Player player = event.getPlayer();
					player.getActivePotionEffects().add(SPEE)
					player.sendMessage(SPEED BITCH);
		
			}
			              	
	


