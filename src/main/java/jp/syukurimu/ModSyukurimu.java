package jp.syukurimu;

import com.ibm.icu.util.RangeDateRule;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
    public static Item syukurimu_strawberry;
    public static Item syukurimu_gold;
    public static Item syukurimu_emerald;
    public static Item Syukurimu_light;
    public static Item syukurimu_chocolate;
    public static Item syukurimu_enchant;
    public static Item syukurimu_hot;
    public static Item syukurimu_meat;
    public static Item syukurimu_sharp;
    public static Item syukurimu_hard;
    public static Item syukurimu_fish;
    public static Item syukurimu_fluffy;
    public static Item syukurimu_glass;

    public static Block syukurimu_block;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        syukurimu = new ItemSyukurimu();
        Syukurimu_maccha = new ItemSyukurimuMaccha();
        syukurimu_strawberry = new ItemSyukurimuStrawberry();
        syukurimu_gold = new ItemSyukurimuGold();
        syukurimu_emerald = new ItemSyukurimuEmerald();
        Syukurimu_light = new ItemSyukurimuLight();
        syukurimu_chocolate = new ItemSyukurimuChocolate();
        syukurimu_enchant = new ItemSyukurimuEnchant();
        syukurimu_hot = new ItemSyukurimuHot();
        syukurimu_meat = new ItemSyukurimuMeat();
        syukurimu_sharp = new ItemSyukurimuSharp();
        syukurimu_hard = new ItemSyukurimuHard();
        syukurimu_fish = new ItemSyukurimuFish();
        syukurimu_fluffy = new ItemSyukurimuFluffy();
        syukurimu_glass = new ItemSyukurimuGlass();
        syukurimu_block = new BlockSyukurimu(Material.CAKE);

        ForgeRegistries.ITEMS.register(syukurimu);
        ForgeRegistries.ITEMS.register(syukurimu_gold);
        ForgeRegistries.ITEMS.register(Syukurimu_maccha);
        ForgeRegistries.ITEMS.register(syukurimu_strawberry);
        ForgeRegistries.ITEMS.register(syukurimu_emerald);
        ForgeRegistries.ITEMS.register(Syukurimu_light);
        ForgeRegistries.ITEMS.register(syukurimu_chocolate);
        ForgeRegistries.ITEMS.register(syukurimu_enchant);
        ForgeRegistries.ITEMS.register(syukurimu_hot);
        ForgeRegistries.ITEMS.register(syukurimu_meat);
        ForgeRegistries.ITEMS.register(syukurimu_sharp);
        ForgeRegistries.ITEMS.register(syukurimu_hard);
        ForgeRegistries.ITEMS.register(syukurimu_fish);
        ForgeRegistries.ITEMS.register(syukurimu_fluffy);
        ForgeRegistries.ITEMS.register(syukurimu_glass);

        ForgeRegistries.BLOCKS.register(syukurimu_block);

        if (event.getSide().isClient()) {
            registerModels();
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerModels() {
        ModelLoader.setCustomModelResourceLocation(syukurimu, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "syukurimu"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Syukurimu_maccha, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "syukurimu_maccha"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(syukurimu_strawberry, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "syukurimu_strawberry"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(syukurimu_gold, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "syukurimu_gold"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(syukurimu_emerald, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "syukurimu_emerald"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Syukurimu_light, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "Syukurimu_light"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(syukurimu_chocolate, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "syukurimu_chocolate"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(syukurimu_enchant, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "syukurimu_enchant"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(syukurimu_hot, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "syukurimu_hot"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(syukurimu_meat, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "syukurimu_meat"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(syukurimu_sharp, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "syukurimu_sharp"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(syukurimu_hard, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "syukurimu_hard"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(syukurimu_fish, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "syukurimu_fish"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(syukurimu_fluffy, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "syukurimu_fluffy"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(syukurimu_glass, 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "syukurimu_glass"), "inventory"));

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(syukurimu_block), 0, new ModelResourceLocation(new ResourceLocation(MOD_ID, "syukurimu_block"), "inventory"));
    }

}