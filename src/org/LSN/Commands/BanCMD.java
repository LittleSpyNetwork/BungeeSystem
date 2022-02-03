package org.LSN.Commands;

public class BCCMD extends Command {
	
	public BanCMD() {
		super("ban");
	}

    	public void execute(CommandSender sender, String[] args) {
		ProxiedPlayer p = (ProxiedPlayer) sender;
		if(p.hasPermission("System.Broadcast")) {
			if (args.length >= 1) {
				for (int i = 0; i < args.length; i++) 
					this.msg += args[i] + " ";
				ProxyServer.getInstance().broadcast("§8[§4§lBroadcast§r§8] §2§l" + this.msg);
				this.msg = "";
			} else {
				p.sendMessage("§cBenutzung: /bc <Nachricht>");
			}
		} else {
			p.sendMessage("§cKeine Rechte!");
		}
	}
}