package jp.syukurimu;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;

public class BlockSyukurimu extends Block {
    public BlockSyukurimu(Material material) {
        super(material);
        setTranslationKey("syukurimu");
        setRegistryName(new ResourceLocation(ModSyukurimu.MOD_ID, "syukurimu_block"));
    }
}
