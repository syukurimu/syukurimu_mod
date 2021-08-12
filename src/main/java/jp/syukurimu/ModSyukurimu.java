package jp.syukurimu;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = ModSyukurimu.MOD_ID, name = ModSyukurimu.MOD_NAME, version = "1.0.0", dependencies = ModSyukurimu.MOD_DEPENDENCIES,
    acceptedMinecraftVersions = ModSyukurimu.MOD_ACCEPTED_MC_VERSIONS, useMetadata = true)
public class ModSyukurimu {
    public static final String MOD_ID = "syukurimu";
    public static final String MOD_NAME = "Cream Puff";
    public static final String MOD_DEPENDENCIES = "";
    public static final String MOD_ACCEPTED_MC_VERSIONS = "[1.12,1.12.2]";

    @Instance("syukurimu")
    public static ModSyukurimu instance;

    public static Item item;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        item = new ItemSyukurimu().setTranslationKey("syukurimu").setRegistryName(new ResourceLocation(MOD_ID, "syukurimu"));
        ForgeRegistries.ITEMS.register(item);
        if (event.getSide().isClient()) {
            registerModels();
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerModels() {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "syukurimu"), "inventory"));
    }
}


