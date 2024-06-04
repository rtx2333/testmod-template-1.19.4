package zc.mod.registry;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import zc.mod.Testmod;

public class ModItemGroup {
    public static ItemGroup CITRINE = FabricItemGroup.builder(new Identifier(Testmod.MOD_ID, "citrine"))
            .displayName(Text.translatable("itemgroup.testmod.citrine"))
            .icon(()-> new ItemStack(Moditems.CITRINE))
            .build();
    public static void registerModItemGroup() {
        Testmod.LOGGER.debug("Registering mod item group for" + Testmod.MOD_ID);
    }
}
