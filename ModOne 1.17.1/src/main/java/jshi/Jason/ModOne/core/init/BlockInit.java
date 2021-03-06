package jshi.Jason.ModOne.core.init;

import jshi.Jason.ModOne.ModOne;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModOne.MOD_ID);
	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", ()-> new Block(
			Properties.of(Material.METAL, MaterialColor.COLOR_BLUE)
			.strength(15f, 30f)
			.harvestTool(ToolType.PICKAXE)
			.harvestLevel(2)
			.sound(SoundType.METAL)));
	
	
	/* harvest level
	 * -1 all tools
	 * 0 wood
	 * 1 stone
	 * 2 iron
	 * 3 diamond
	 * 4 neterite
	 */
}

// .create is now .of, and .group is now .tab