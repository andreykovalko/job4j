package ru.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long timecreating = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", timecreating);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
    Tracker tracker = new Tracker();
    Item previous = new Item("test1", "testDescription", 123L);
    tracker.add(previous);
    Item next = new Item("test2", "testDescription2", 1234L);
    next.setId(previous.getId());
    tracker.replace(previous.getId(), next);
    assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenIdThenFindById() {
        Tracker tracker = new Tracker();
        long timecreating = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", timecreating);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result, is(item));
    }

    @Test
    public void whenDeleteById() {
        Tracker tracker = new Tracker();
        long timecreating1 = System.currentTimeMillis();
        long timecreating2 = System.currentTimeMillis();
        Item item1 = new Item("test1", "testDescription1", timecreating1);
        Item item2 = new Item("test2", "testDescription2", timecreating2);
        tracker.add(item1);
        tracker.add(item2);
        tracker.delete(item2.getId());
        Item result = tracker.findById(item2.getId());
        assertThat(result, is(nullValue()));
    }

    @Test
    public void whenFindAllElementsWithoutNull() {
        Tracker tracker = new Tracker();
        long timecreating1 = System.currentTimeMillis();
        long timecreating2 = System.currentTimeMillis();
        Item item1 = new Item("test1", "testDescription1", timecreating1);
        Item item2 = new Item("test2", "testDescription2", timecreating2);
        tracker.add(item1);
        tracker.add(item2);
        Item[] expected = new Item[] {item1, item2};
        Item[] result = tracker.findAll();
        assertThat(result, is(expected));
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        long timecreating1 = System.currentTimeMillis();
        long timecreating2 = System.currentTimeMillis();
        Item item1 = new Item("test1", "testDescription1", timecreating1);
        Item item2 = new Item("test1", "testDescription2", timecreating2);
        tracker.add(item1);
        tracker.add(item2);
        Item[] expected = new Item[] {item1, item2};
        Item[] result = tracker.findByName("test1");
        assertThat(result, is(expected));
    }

}