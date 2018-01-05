package pw.cinque.timechanger.commands;

import net.minecraft.client.*;
import net.minecraft.command.*;
import net.minecraft.server.MinecraftServer;
import pw.cinque.timechanger.*;
import net.minecraft.util.*;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class CommandDay extends CommandBase
{
    private Minecraft mc;
    
    public CommandDay() {
        this.mc = Minecraft.getMinecraft();
    }
    
    public String getName() {
        return "day";
    }
    
    public String getUsage(final ICommandSender sender) {
        return "/day";
    }
    
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        TimeChanger.TIME_TYPE = TimeType.DAY;
        sender.sendMessage(new TextComponentString(TextFormatting.GREEN + "Time is set to day."));
    }
    
    public int getRequiredPermissionLevel() {
        return 0;
    }
    
    public boolean canCommandSenderUseCommand(final ICommandSender sender) {
        return true;
    }
}
