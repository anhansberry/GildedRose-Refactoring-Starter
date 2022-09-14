package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) { // start loop thru all items
            if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert") || items[i].name.equals("Aged Brie")){
                // backstage passes or aged brie
                if (items[i].quality < 50) {
                    items[i].quality++;
                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) { // if backstage passes
                        if ((items[i].sellIn < 11 || items[i].sellIn < 6 ) && items[i].quality < 50) {
                            items[i].quality++;
                        }
                    } else { // if brie

                    }
                }
            } else { // not backstage passes or aged brie
                if (items[i].quality > 0 && !items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                }
            }

            // refactored up until here
            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        // end loop thru all itmes
        }
    }
}