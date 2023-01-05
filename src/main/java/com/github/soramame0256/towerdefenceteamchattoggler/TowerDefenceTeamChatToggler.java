package com.github.soramame0256.towerdefenceteamchattoggler;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
        modid = TowerDefenceTeamChatToggler.MOD_ID,
        name = TowerDefenceTeamChatToggler.MOD_NAME,
        version = TowerDefenceTeamChatToggler.VERSION
)
public class TowerDefenceTeamChatToggler {

    public static final String MOD_ID = "TowerDefenceTeamChatToggler";
    public static final String MOD_NAME = "TowerDefenceTeamChatToggler";
    public static final String VERSION = "1.0-SNAPSHOT";
    public static boolean isEnabled = false;

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static TowerDefenceTeamChatToggler INSTANCE;

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }
    @SubscribeEvent
    public void onChatSend(ClientChatEvent e){
        if(isEnabled) e.setMessage("/tc " + e.getMessage());
    }

}
