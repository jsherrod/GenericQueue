package edu.gcccd.csis;

import java.util.*;

public class GenericQueue<E>
{

    private final ArrayList<E> elements;

    public GenericQueue()
    {
        this(10);
    }

    public GenericQueue(int capacity)
    {
        int initCapacity = capacity > 0 ? capacity : 10;
        elements = new ArrayList<E>(initCapacity);
    }

    public E dequeue()
    {
        if (elements.isEmpty())
        {
            throw new NoSuchElementException("Queue is empty. There is nothing to dequeue.");
        }
        return elements.remove(0);
    }

    public void enqueue(E queueValue)
    {
        elements.add(queueValue);
    }

    // current length of the queue
    public int length()
    {
        return elements.size();
    }

    @Override
    public String toString()
    {
        return String.format(String.valueOf(elements));
    }

}