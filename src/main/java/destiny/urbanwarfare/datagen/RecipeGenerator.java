package destiny.urbanwarfare.datagen;

import net.minecraft.item.Items;
import com.mrcrayfish.guns.crafting.WorkbenchIngredient;
import net.minecraftforge.common.Tags;
import com.mrcrayfish.guns.crafting.WorkbenchRecipeBuilder;
import destiny.urbanwarfare.registry.ItemRegistry;
import net.minecraft.data.IFinishedRecipe;
import java.util.function.Consumer;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.RecipeProvider;

public class RecipeGenerator extends RecipeProvider
{
    public RecipeGenerator(DataGenerator generator)
    {
        super(generator);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer)
    {

        WorkbenchRecipeBuilder.crafting(ItemRegistry.SPAS12.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 25))
                .addIngredient(WorkbenchIngredient.of(Items.GRAY_CONCRETE, 8))
                .addIngredient(WorkbenchIngredient.of(Items.IRON_BARS, 6))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_gray_concrete", has(Items.GRAY_CONCRETE))
                .addCriterion("has_iron_bar", has(Items.IRON_BARS))
                .build(consumer);

        WorkbenchRecipeBuilder.crafting(ItemRegistry.KRISS_VECTOR.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 10))
                .addIngredient(WorkbenchIngredient.of(Items.GRAY_CONCRETE, 5))
                .addIngredient(WorkbenchIngredient.of(Items.IRON_BARS, 12))
                .addIngredient(WorkbenchIngredient.of(Items.HEAVY_WEIGHTED_PRESSURE_PLATE, 2))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_gray_concrete", has(Items.GRAY_CONCRETE))
                .addCriterion("has_iron_bar", has(Items.IRON_BARS))
                .addCriterion("has_pressure_plate", has(Items.HEAVY_WEIGHTED_PRESSURE_PLATE))
                .build(consumer);

        WorkbenchRecipeBuilder.crafting(ItemRegistry.GLOCK19.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 8))
                .addIngredient(WorkbenchIngredient.of(Items.GRAY_CONCRETE, 3))
                .addIngredient(WorkbenchIngredient.of(Items.IRON_BARS, 4))
                .addIngredient(WorkbenchIngredient.of(Items.HEAVY_WEIGHTED_PRESSURE_PLATE, 1))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 6))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_gray_concrete", has(Items.GRAY_CONCRETE))
                .addCriterion("has_iron_bar", has(Items.IRON_BARS))
                .addCriterion("has_pressure_plate", has(Items.HEAVY_WEIGHTED_PRESSURE_PLATE))
                .addCriterion("has_iron_nugget", has(Tags.Items.NUGGETS_IRON))
                .build(consumer);
    }
}
