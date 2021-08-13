package jp.syukurimu;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;

public class ItemSyukurimu extends ItemFood {
    public ItemSyukurimu() {
        super(20, 20, false);
        setTranslationKey("syukurimu");
        setRegistryName(new ResourceLocation(ModSyukurimu.MOD_ID, "syukurimu"));
        setAlwaysEdible();
    }
}



