# -*- coding: utf-8 -*-
import unittest

from gilded_rose import Item, GildedRose


class GildedRoseTest(unittest.TestCase):
    def test_foo(self):
        items = [Item("Aged Brie", -1, 5)]
        gilded_rose = GildedRose(items)
        gilded_rose.update_quality()
        self.assertEquals(6, items[0].quality)
        self.asserEquals(-2, items[0].sell_in)

class GildedRoseTest(unittest.TestCase):
    def test_foo(self):
        items = [Item("Apple", -1, 5)]
        gilded_rose = GildedRose(items)
        gilded_rose.update_quality()
        self.assertEquals(3, items[0].quality)

class GildedRoseTest(unittest.TestCase):
    def test_foo(self):
        items = [Item("Banana", 1, 5)]
        gilded_rose = GildedRose(items)
        gilded_rose.update_quality()
        self.assertEquals(4, items[0].quality)
        self.asserEquals(0, items[0].sell_in)

class GildedRoseTest(unittest.TestCase):
    def test_foo(self):
        items = [Item("Backstage passes to a TAFKAL80ETC concert", 5, 5)]
        gilded_rose = GildedRose(items)
        gilded_rose.update_quality()
        self.assertEquals(8, items[0].quality)

class GildedRoseTest(unittest.TestCase):
    def test_foo(self):
        items = [Item("Backstage passes to a TAFKAL80ETC concert", 11, 5)]
        gilded_rose = GildedRose(items)
        gilded_rose.update_quality()
        self.assertEquals(7, items[0].quality)

class GildedRoseTest(unittest.TestCase):
    def test_foo(self):
        items = [Item("Backstage passes to a TAFKAL80ETC concert", -1, 5)]
        gilded_rose = GildedRose(items)
        gilded_rose.update_quality()
        self.assertEquals(0, items[0].quality)

class GildedRoseTest(unittest.TestCase):
    def test_foo(self):
        items = [Item("Backstage passes to a TAFKAL80ETC concert", 5, 5)]
        gilded_rose = GildedRose(items)
        gilded_rose.update_quality()
        self.assertEquals(4, items[0].sell_in)



        
if __name__ == '__main__':
    unittest.main()
