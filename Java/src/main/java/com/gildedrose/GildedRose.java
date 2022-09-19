package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        for (int i = 0; i < items.length; i++) {

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;

                if (items[i].name.equals("Aged Brie")){
                    if (items[i].quality < 50){ // Sued nested ifs so that even if quality = 50, the outer if still runs and it doesnt subtract 1 from quality later
                        items[i].quality ++;
                    }
                }
                else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")){
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
                else if (items.)
                else if (items[i].quality > 0) {
                    items[i].quality --;
                    if (items[i].sellIn < 0 && items[i].quality > 0){
                        items[i].quality --;
                    }
                }
    
            }

            
        }
    }
}