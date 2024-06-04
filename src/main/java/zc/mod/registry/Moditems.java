package zc.mod.registry;

import jdk.incubator.vector.VectorOperators;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import zc.mod.Testmod;

public class Moditems {
    public static final Item CITRINE = registerItem("citrine",
            new Item(new FabricItemSettings()));

    public static final Item RAW_CITRINE = registerItem("raw_citrine",
            new Item(new FabricItemSettings()));
    public static Item registerItem(String name, Item item, ItemGroup... itemGroups) {
        Object Testmodl;
        Item regiteredItem = Registry.register(Registries.ITEM, new Identifier(Testmod.MOD_ID, name), item);
        ItemConvertible registeredItem = null;
        for (ItemGroup itemGroup : itemGroups) {
            registeredItem = null;
            ItemConvertible finalRegisteredItem = registeredItem;
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(finalRegisteredItem));
        }
        return (Item) registeredItem;
    }
    public static void registersModItems() {
        Testmod.LOGGER.debug("Registering mod items for" + Testmod.MOD_ID);
    }
}
