
package net.mcreator.namidessubnautica.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class Ocker2Block extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public Ocker2Block() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.GRAVEL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(14, 1, 0, 16, 23, 7), box(0, 1, 0, 2, 23, 7), box(2, 1, 0, 14, 23, 1), box(1, 0, 0, 15, 1, 7), box(2, 1, 1, 14, 2, 7), box(2, 8, 1, 14, 9, 7), box(2, 22, 1, 14, 23, 7), box(2, 15, 1, 14, 16, 7),
					box(1, 23, 0, 15, 24, 7), box(1, 1, 7, 15, 23, 8));
			case NORTH -> Shapes.or(box(0, 1, 9, 2, 23, 16), box(14, 1, 9, 16, 23, 16), box(2, 1, 15, 14, 23, 16), box(1, 0, 9, 15, 1, 16), box(2, 1, 9, 14, 2, 15), box(2, 8, 9, 14, 9, 15), box(2, 22, 9, 14, 23, 15), box(2, 15, 9, 14, 16, 15),
					box(1, 23, 9, 15, 24, 16), box(1, 1, 8, 15, 23, 9));
			case EAST -> Shapes.or(box(0, 1, 0, 7, 23, 2), box(0, 1, 14, 7, 23, 16), box(0, 1, 2, 1, 23, 14), box(0, 0, 1, 7, 1, 15), box(1, 1, 2, 7, 2, 14), box(1, 8, 2, 7, 9, 14), box(1, 22, 2, 7, 23, 14), box(1, 15, 2, 7, 16, 14),
					box(0, 23, 1, 7, 24, 15), box(7, 1, 1, 8, 23, 15));
			case WEST -> Shapes.or(box(9, 1, 14, 16, 23, 16), box(9, 1, 0, 16, 23, 2), box(15, 1, 2, 16, 23, 14), box(9, 0, 1, 16, 1, 15), box(9, 1, 2, 15, 2, 14), box(9, 8, 2, 15, 9, 14), box(9, 22, 2, 15, 23, 14), box(9, 15, 2, 15, 16, 14),
					box(9, 23, 1, 16, 24, 15), box(8, 1, 1, 9, 23, 15));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		if (context.getClickedFace().getAxis() == Direction.Axis.Y)
			return this.defaultBlockState().setValue(FACING, Direction.NORTH);
		return this.defaultBlockState().setValue(FACING, context.getClickedFace());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
