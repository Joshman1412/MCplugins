package me.josh.BreadEffect;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import com.sun.source.util.Plugin;

import Items.ItemManager;
import me.josh.BreadEffect.Commands.Commands;
import me.josh.BreadEffect.events.events;

public class Main extends JavaPlugin{
	
	
	@Override
	public void onEnable(){
		ItemManager.init();
		getserver().getpluginManager().registerevents(new events(), Plugin:this);
		getCommand(name:"giveSpeedbread").setExecutor(new Commands());
	}
		
		
	@Override  
	public void onDisable() { }
		
	
    }
