package block.main;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class cordinator implements Listener {
	
	@EventHandler
	public void bb(BlockBreakEvent e) {
		Player p = e.getPlayer();
		Block b = e.getBlock();
		
		p.sendMessage(ChatColor.DARK_RED + "Блок сломан: " + b.getX() + " " + b.getY() + " " + b.getZ());
	}

	@EventHandler
	public void bb(BlockPlaceEvent e) {
		Player p = e.getPlayer();
		Block br = e.getBlock();
		
		p.sendMessage(ChatColor.AQUA + "Блок установлен: " + br.getX() + " " + br.getY() + " " + br.getZ());
}
}