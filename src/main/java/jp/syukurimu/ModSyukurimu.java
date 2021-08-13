package jp.syukurimu;

import com.ibm.icu.util.RangeDateRule;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
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
    public static Item syukurimu;
    public static Item Syukurimu_maccha;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        syukurimu = new ItemSyukurimu();
        Syukurimu_maccha = new ItemSyukurimuMaccha();

        ForgeRegistries.ITEMS.register(syukurimu);
        if (event.getSide().isClient()) {
            registerModels();
        }
        ForgeRegistries.ITEMS.register(Syukurimu_maccha);
        if (event.getSide().isClient()) {
            registerModels();
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerModels() {
        ModelLoader.setCustomModelResourceLocation(syukurimu, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "syukurimu"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Syukurimu_maccha, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "syukurimu_maccha"), "inventory"));
    }

}


