package Items;

import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import jdk.jfr.DataAmount;

public class ItemManager {
	
	public static ItemStack Speedbread;
	
	public static void init() {
		createwand();

   }
	
	private static void createwand() {
		ItemStack item = new ItemStack(Material.BREAD, DataAmount:1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("Speed Bread");
		List<String> lore = new ArrayList<>();
		lore.add("This Bread gives you speed")
		meta.setLore(lore);
		meta.addPotionEffect(PotionEffectType.SPEED, 3, false)
		meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(meta)
		SpeedBread = item;
	}
}