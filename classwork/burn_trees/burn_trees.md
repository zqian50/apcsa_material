# Burning Trees Simulator

## Problem

Consider a forest that is made up of a NxN grid, and that some percentage of the spaces of the grid are randomly filled with trees. You must light the trees on fire, and see how long the fire will burn. The starting position of the trees is randomized, so each run will have a differnet number of rounds before the fire burns out completely. You must calculate the number of rounds of burn time for a particular forest.

### Specifications

- There are 4 states for a square: empty, tree, fire, ash.
- At the start of a round all existing fire will spread and then turn to ash.
- A fire will spread to all trees directly adjacent to the fire (not diagonal).
- A tree that just turned into fire will not spread until the next round.
- Empty spaces and ash cannot catch fire.

The effect is that fire will expand by one square each round. Eventually the fire will stop burning because there are no more trees adjacent to the existing fire.


## Simulation

Start the simulation by setting the fire to the leftmost column of trees in the forest (second grid in the example).

## Example

![image](https://github.com/novillo-cs/apcsa_material/assets/123229891/15088b9f-0ded-4ccb-a161-11f7f9ed0fc2)

![image](https://github.com/novillo-cs/apcsa_material/assets/123229891/2ea87f11-4278-428a-8e4e-daac38471944)


## Adjustments

The density of trees can be adjusted and this would affect the burn time:

- Consider 100% density, the fire would burn for a number of rounds equal to the width of the grid.
- Consider an forest of 10% density (still randomly arranged), the fire would stop almost immediately due to lack of adjacent trees to burn.

## Classwork

### Day 1

Complete the following methodds:

- tick() - advance the map to the next state.
- done() - determine if there are more fires left.

You may modify the map directly. Please use the words TREE/FIRE/ASH/SPACE in your method to make the code more readable. The only values map should contain at the end of a tick are TREE/FIRE/ASH/SPACE.

If your prefer, you are allowed to make a copy of the array so that you have an easier time manipulating/calculating states. This may be slow, but we can improve it after it works.

```
private int[][]map;
private int ticks;
private static final int TREE = 2;
private static final int FIRE = 1;
private static final int ASH = 3;
private static final int SPACE = 0;
```

You will most likely need to add a few extra instance variables to make this simulation work in a reasonable amount of time. However, do not add too many, keep it simple. When you do this, feel free to update the constructor and other methods accordingly.

Once this works, you can use your working simulation to determine the behavior of the fire on different densities.
