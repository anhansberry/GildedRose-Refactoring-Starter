package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    // Aged Brie Tests

    @Test
    void testBrie() {
        Item[] items = new Item[] { new Item("Aged Brie", 5, 4) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(5, app.items[0].quality);
    }
    @Test
    void testBrie2() {
        Item[] items = new Item[] { new Item("Aged Brie", 2, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }

    // Regular Item Tests

    @Test
    void testVest() {
        Item[] items = new Item[] { new Item("Vest", 1, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].quality);
    }
    @Test
    void testVest2() {
        Item[] items = new Item[] { new Item("Vest", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(8, app.items[0].quality);
    }

    // Sulfuras Tests

    @Test
    void testSulfuras() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(5, app.items[0].quality);
    }
    @Test
    void testSulfuras2() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 5, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(5, app.items[0].sellIn);
    }

    // Conjured Item Test

    @Test
    void testConjuredVest() {
        Item[] items = new Item[] { new Item("Conjured vest", 5, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(3, app.items[0].quality);
    }

    // Backstage Pass Tests

    @Test
    void testBackstagePasses1() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 11, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(11, app.items[0].quality);
    }
    @Test
    void testBackstagePasses2() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 6, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(12, app.items[0].quality);
    }
    @Test
    void testBackstagePasses3() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 1, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(13, app.items[0].quality);
    }
    @Test
    void testBackstagePasses4() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }
    

}
