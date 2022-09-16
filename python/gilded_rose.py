# -*- coding: utf-8 -*-

class GildedRose(object):

    def __init__(self, items):
        self.items = items

    def update_quality(self):
        for item in self.items:
            degradeby = 1
            if item.name[0:8] == "Conjured":
                degradeby = 2
            if item.name != "Sulfuras, Hand of Ragnaros":
                if item.name != "Aged Brie" and item.name != "Backstage passes to a TAFKAL80ETC concert" and item.name != "Conjured Aged Brie" and item.name!= "Conjured Backstage passes to a TAFKAL80ETC concert":
                    if item.quality > 0 and item.quality <=50:
                        if item.sell_in>=0:
                            item.quality = item.quality - degradeby
                        else:
                            item.quality = item.quality - 2 * degradeby
                        item.sell_in = item.sell_in - 1
                elif item.name == "Aged Brie" or item.name == "Conjured Aged Brie":
                    if item.quality < 50 and item.quality >= 0:
                        item.quality = item.quality + degradeby
                    if item.sell_in < 50 and item.sell_in >= 0:
                        item.sell_in = item.sell_in - 1
                elif item.name == "Backstage passes to a TAFKAL80ETC concert" or item.name == "Conjured Backstage passes to a TAFKAL80ETC concert":
                    if item.sell_in < 0:
                        item.quality = 0
                    else:
                        if item.quality < 50 and item.quality >=0:
                            if item.sell_in <= 10 and item.sell_in > 5:
                                item.quality = item.quality + 2 * degradeby
                            elif item.sell_in <= 5:
                                item.quality = item.quality + 3 * degradeby
                        item.sell_in = item.sell_in - 1


class Item:
    def __init__(self, name, sell_in, quality):
        self.name = name
        self.sell_in = sell_in
        self.quality = quality

    def __repr__(self):
        return "%s, %s, %s" % (self.name, self.sell_in, self.quality)
