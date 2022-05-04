# Billing System
Basic Billing System. An input file decides which items and currency the system runs on. It will then show a GUI where the user will be able to select a number of items and get a receipt generated depending on the result.

# File input format
Format of the input. File should be of type *.billdata* and look like the example below.
```
6
CURRENCY
ITEM_NAME ITEM_COST
ITEM_NAME ITEM_COST
ITEM_NAME ITEM_COST
ITEM_NAME ITEM_COST
ITEM_NAME ITEM_COST
ITEM_NAME ITEM_COST
```
The number at the top of the file is for the amount of items in the file.
**CURRENCY** is for the currency prices are written in. For example *USD* will set the currency to american dollars. *SEK* would set the currency to swedish crowns.

**ITEM_NAME** is the name for the listed item.

**ITEM_COST** is the price for the item.

**NOTE:** Currently the program can only receive an input with a total of 10 items, no more or less.

## Current supported currency formats
* SEK