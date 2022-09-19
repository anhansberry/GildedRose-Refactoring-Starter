package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        for (int i = 0; i < items.length; i++) {

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) { // Makes sure it's not Sulfuras before subtracting from sellIn
                items[i].sellIn = items[i].sellIn - 1;

                if (items[i].name.equals("Aged Brie")){ // Aged Brie
                    if (items[i].quality < 50){ // Used nested ifs so that even if quality = 50, the outer if still runs and it doesnt subtract from quality later
                        items[i].quality ++;
                    }
                }
                else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")){ //Backstage Passes
                    items[i].quality ++;
                    if (items[i].sellIn < 10 && items[i].quality < 50){
                        items[i].quality = items[i].quality + 1;
                    }
                    if (items[i].sellIn < 5 && items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                    if (items[i].sellIn < 0) {
                        items[i].quality = 0;
                    }
                }
                else if (items[i].name.contains("Conjured")){ // Conjured items - subtracts from quality
                    items[i].quality -= 2;
                    if (items[i].sellIn < 0){
                        items[i].quality -=2;
                    }
                }
                else{ // Everything else - subtracts from quality
                    items[i].quality --;
                    if (items[i].sellIn < 0){
                        items[i].quality --;
                    }
                }
                if (items[i].quality < 0){ //Ensures quality doesn't stay below 0
                    items[i].quality = 0;
                }
    
            }

            
        }
    }
}