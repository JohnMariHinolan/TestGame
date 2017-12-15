package com.jm.cardexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.jm.config.CurrencyTypeEnum;
import com.jm.currency.Currency;
import com.jm.obj.free.FreeCard;

public class DrawInfo {
	
	public DrawInfo(CurrencyTypeEnum reqCurrency) {
		this.setReqCurrency(reqCurrency);
	}
	
	private int freeCardCurrTier = 1;
	// default
	private int freeCardTurnMaxWait = 5;
	private int freeCardCurTurnWait = 1; 
	
	private int upgradeReq = 1000;
	
	private CurrencyTypeEnum reqCurrency;
	
	private List<FreeCard> freeCardDeck;
		
	
	public void upgradeTier(Currency currency) {}
	
	public void upgradeDraw(Currency currency){}
	
	//*	**//
	public List<FreeCard> drawCard(int numOfCardToDraw) {
		Collections.shuffle(freeCardDeck);
		
			List<FreeCard> drawedCard = freeCardDeck.stream().filter(freeCard -> {
			
			
			if(freeCard.getCardLvl() <= freeCardCurrTier ) {
				return true;
			}else {
				return false;
			}
			
		}).limit(numOfCardToDraw).collect(Collectors.toList()); 
		return drawedCard;
	}
	
	public int getFreeCardCurrTier() {
		return freeCardCurrTier;
	}
	public void setFreeCardCurrTier(int freeCardCurrTier) {
		this.freeCardCurrTier = freeCardCurrTier;
	}
	public int getFreeCardTurnMaxWait() {
		return freeCardTurnMaxWait;
	}
	public void setFreeCardTurnMaxWait(int freeCardTurnMaxWait) {
		this.freeCardTurnMaxWait = freeCardTurnMaxWait;
	}
	public int getFreeCardCurTurnWait() {
		return freeCardCurTurnWait;
	}
	public void setFreeCardCurTurnWait(int freeCardCurTurnWait) {
		this.freeCardCurTurnWait = freeCardCurTurnWait;
	}
	public List<FreeCard> getFreeCardDeck() {
		return freeCardDeck;
	}
	public void setFreeCardDeck(List<FreeCard> freeCardDeck) {
		this.freeCardDeck = freeCardDeck;
	}


	public int getUpgradeReq() {
		return upgradeReq;
	}

	public void setUpgradeReq(int upgradeReq) {
		this.upgradeReq = upgradeReq;
	}

	public CurrencyTypeEnum getReqCurrency() {
		return reqCurrency;
	}

	public void setReqCurrency(CurrencyTypeEnum reqCurrency) {
		this.reqCurrency = reqCurrency;
	}
	
	
}
