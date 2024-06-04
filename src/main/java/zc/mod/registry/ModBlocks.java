package zc.mod.registry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import zc.mod.Testmod;

public class ModBlocks {

    public static final Block CITRINE_BLOCK = registerBlock("citrine_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()),
            ModItemGroup.CITRINE);

    public static final Block CITRINE_ORE = registerBlock("citrine_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(1, 5)),
            ModItemGroup.CITRINE);

    public static final Block DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()),
            ModItemGroup.CITRINE);

    public static Block registerBlock(String name, Block block, ItemGroup...itemGroups) {
        Moditems.registerItem(name, new BlockItem(block, new FabricItemSettings()), itemGroups);
        return Registry.register(Registries.BLOCK, new Identifier(Testmod.MOD_ID, name), block);
    }

    public static void  registerModBlocks() {
        Testmod.LOGGER.debug("Registering mod block for" + Testmod.MOD_ID);
    }
}
