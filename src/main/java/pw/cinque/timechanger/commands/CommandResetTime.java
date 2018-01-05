package pw.cinque.timechanger.commands;

import net.minecraft.client.*;
import net.minecraft.command.*;
import net.minecraft.server.MinecraftServer;
import pw.cinque.timechanger.*;
import net.minecraft.util.*;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class CommandResetTime extends CommandBase
{
    private Minecraft mc;
    
    public CommandResetTime() {
        this.mc = Minecraft.getMinecraft();
    }
    
    public String getName() {
        return "resettime";
    }
    
    public String getUsage(final ICommandSender sender) {
        return "/resettime";
    }
    
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        TimeChanger.TIME_TYPE = TimeType.VANILLA;
        sender.sendMessage(new TextComponentString(TextFormatting.AQUA + "Now using vanilla time."));
    }
    
    public int getRequiredPermissionLevel() {
        return 0;
    }
    
    public boolean canCommandSenderUseCommand(final ICommandSender sender) {
        return true;
    }
}
