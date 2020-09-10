# Pools

Pools are dictionaries that maps variable names to their values.
There are 2 pools built-in that are:
* GlobalPool
* ModulePool

## GlobalPool
The GlobalPool contains the base system classes and objects.

## ModulePool
The ModulePool contains classes and objects declared or imported into a module.
A notable object that every module pool contains is the ***module*** object instantiated
from the ***Module*** class for each module.
