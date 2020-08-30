package com.ambition.exercise3;

public class CardDemo {
    public static void main(String[] args) {
        Card card = new Card("红色", 9);

        String str = card.ShowCard(card.color, card.pointerNumber);

        System.out.println(str);
    }
}
