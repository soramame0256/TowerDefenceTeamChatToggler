package com.github.soramame0256.towerdefenceteamchattoggler;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;

import static com.github.soramame0256.towerdefenceteamchattoggler.TowerDefenceTeamChatToggler.isEnabled;

public class ToggleCommand extends CommandBase {
    @Override
    public String getName() {
        return "/tctoggle";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "/tctoggle";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        sender.sendMessage(new TextComponentString("§aコマンドの有効状態を"+ (isEnabled=!isEnabled) + "に変更しました。"));
    }
}
