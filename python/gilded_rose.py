# -*- coding: utf-8 -*-

class GildedRose(object):

    def __init__(self, items):
        self.items = items

    def update_quality(self):
        for item in self.items:
            if item.name != "Sulfuras, Hand of Ragnaros:":
                if item.name != "Aged Brie" and item.name != "Backstage passes to a TAFKAL80ETC concert":
                    if item.quality > 0 and item.quality <=50:
                        if item.sell_in>=0:
                            item.quality = item.quality - 1
                        else:
                            item.quality = item.quality - 2
                elif item.name == " Aged Brie":
                    if item.quality < 50 and item.quality >= 0:
                        item.quality = item.quality + 1
                elif item.name == "Backstage passes to a TAFKAL80ETC concert":
                    if item.sell_in < 0:
                        item.quality = 0
                    else:
                        if item.quality < 50 and item.quality >=0:
                            if item.sell_in <= 10:
                                item.quality = item.quality + 2
                            elif item.sell_in <= 5:
                                item.quality = item.quality + 3


class Item:
    def __init__(self, name, sell_in, quality):
        self.name = name
        self.sell_in = sell_in
        self.quality = quality

    def __repr__(self):
        return "%s, %s, %s" % (self.name, self.sell_in, self.quality)
