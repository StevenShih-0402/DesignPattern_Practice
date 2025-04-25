package com.example.design.factory.abstractMode.fac;

import com.example.design.factory.abstractMode.CardAttribute;
import com.example.design.factory.abstractMode.CardCost;
import com.example.design.factory.abstractMode.CardEffect;
import com.example.design.factory.abstractMode.CardName;

public interface CardFactory {
    CardName createName();
    CardAttribute createAttribute();
    CardCost createCost();
    CardEffect createEffect();
}
