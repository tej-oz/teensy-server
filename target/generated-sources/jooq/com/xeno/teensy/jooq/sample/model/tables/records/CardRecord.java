/*
 * This file is generated by jOOQ.
 */
package com.xeno.teensy.jooq.sample.model.tables.records;


import com.xeno.teensy.jooq.sample.model.tables.Card;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CardRecord extends UpdatableRecordImpl<CardRecord> implements Record6<Integer, String, String, String, Integer, Integer> {

    private static final long serialVersionUID = 156930904;

    /**
     * Setter for <code>teensy.card.id</code>.
     */
    public CardRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>teensy.card.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>teensy.card.title</code>.
     */
    public CardRecord setTitle(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>teensy.card.title</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>teensy.card.description</code>.
     */
    public CardRecord setDescription(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>teensy.card.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>teensy.card.icon</code>.
     */
    public CardRecord setIcon(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>teensy.card.icon</code>.
     */
    public String getIcon() {
        return (String) get(3);
    }

    /**
     * Setter for <code>teensy.card.urlId</code>.
     */
    public CardRecord setUrlid(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>teensy.card.urlId</code>.
     */
    public Integer getUrlid() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>teensy.card.groupId</code>.
     */
    public CardRecord setGroupid(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>teensy.card.groupId</code>.
     */
    public Integer getGroupid() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, String, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, String, String, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Card.CARD.ID;
    }

    @Override
    public Field<String> field2() {
        return Card.CARD.TITLE;
    }

    @Override
    public Field<String> field3() {
        return Card.CARD.DESCRIPTION;
    }

    @Override
    public Field<String> field4() {
        return Card.CARD.ICON;
    }

    @Override
    public Field<Integer> field5() {
        return Card.CARD.URLID;
    }

    @Override
    public Field<Integer> field6() {
        return Card.CARD.GROUPID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getTitle();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public String component4() {
        return getIcon();
    }

    @Override
    public Integer component5() {
        return getUrlid();
    }

    @Override
    public Integer component6() {
        return getGroupid();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getTitle();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public String value4() {
        return getIcon();
    }

    @Override
    public Integer value5() {
        return getUrlid();
    }

    @Override
    public Integer value6() {
        return getGroupid();
    }

    @Override
    public CardRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public CardRecord value2(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public CardRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public CardRecord value4(String value) {
        setIcon(value);
        return this;
    }

    @Override
    public CardRecord value5(Integer value) {
        setUrlid(value);
        return this;
    }

    @Override
    public CardRecord value6(Integer value) {
        setGroupid(value);
        return this;
    }

    @Override
    public CardRecord values(Integer value1, String value2, String value3, String value4, Integer value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CardRecord
     */
    public CardRecord() {
        super(Card.CARD);
    }

    /**
     * Create a detached, initialised CardRecord
     */
    public CardRecord(Integer id, String title, String description, String icon, Integer urlid, Integer groupid) {
        super(Card.CARD);

        set(0, id);
        set(1, title);
        set(2, description);
        set(3, icon);
        set(4, urlid);
        set(5, groupid);
    }
}
