package com.example.design.factory.abstractMode.fac;

import com.example.design.factory.abstractMode.CardAttribute;
import com.example.design.factory.abstractMode.CardCost;
import com.example.design.factory.abstractMode.CardEffect;
import com.example.design.factory.abstractMode.CardName;
import com.example.design.factory.abstractMode.magic.MagicAttribute;
import com.example.design.factory.abstractMode.magic.MagicCost;
import com.example.design.factory.abstractMode.magic.MagicEffect;
import com.example.design.factory.abstractMode.magic.MagicName;

public class MagicCardFactory implements CardFactory {
    @Override
    public CardName createName() {
        return new MagicName();
    }

    @Override
    public CardAttribute createAttribute() {
        return new MagicAttribute();
    }

    @Override
    public CardCost createCost() {
        return new MagicCost();
    }

    @Override
    public CardEffect createEffect() {
        return new MagicEffect();
    }
} 