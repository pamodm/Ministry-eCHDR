package com.echdr.android.echdrapp.ui.event_form;

import android.graphics.Color;

import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.HashMap;
import java.util.Map;


public class DataValuesWHO {

    private static DataValuesWHO instance;
    Map<Integer, double[]> heightForAgeGirls;
    Map<Integer, double[]> heightForAgeBoys;
    Map<Integer, double[]> weightForAgeGirls;
    Map<Integer, double[]> weightForAgeBoys;

    //weight for height girls
    Map<Number, double[]> weightForHeightBoys0to2;
    Map<Number, double[]> weightForHeightBoys2to5;
    Map<Number, double[]> weightForHeightGirls0to2;
    Map<Number, double[]> weightForHeightGirls2to5;

    private DataValuesWHO() {
        heightForAgeGirls = new HashMap<Integer, double[]>();
        heightForAgeBoys = new HashMap<Integer, double[]>();
        weightForAgeGirls = new HashMap<Integer, double[]>();
        weightForAgeBoys = new HashMap<Integer, double[]>();

        weightForHeightBoys0to2 = new HashMap<Number, double[]>();
        weightForHeightBoys2to5 = new HashMap<Number, double[]>();
        weightForHeightGirls0to2 = new HashMap<Number, double[]>();
        weightForHeightGirls2to5 = new HashMap<Number, double[]>();
    }

    public static DataValuesWHO getInstance() {
        if (instance == null) {
            instance = new DataValuesWHO();
        }
        return instance;
    }

    public void initializeheightForAgeGirls() {
        heightForAgeGirls.put(0, new double[]{43.6, 45.4, 47.3, 52.9});
        heightForAgeGirls.put(1, new double[]{47.8, 49.8, 51.7, 57.6});
        heightForAgeGirls.put(2, new double[]{51, 53, 55, 61.1});
        heightForAgeGirls.put(3, new double[]{53.5, 55.6, 57.7, 64});
        heightForAgeGirls.put(4, new double[]{55.6, 57.8, 59.9, 66.4});
        heightForAgeGirls.put(5, new double[]{57.4, 59.6, 61.8, 68.5});
        heightForAgeGirls.put(6, new double[]{58.9, 61.2, 63.5, 70.3});
        heightForAgeGirls.put(7, new double[]{60.3, 62.7, 65, 71.9});
        heightForAgeGirls.put(8, new double[]{61.7, 64, 66.4, 73.5});
        heightForAgeGirls.put(9, new double[]{62.9, 65.3, 67.7, 75});
        heightForAgeGirls.put(10, new double[]{64.1, 66.5, 69, 76.4});
        heightForAgeGirls.put(11, new double[]{65.2, 67.7, 70.3, 77.8});
        heightForAgeGirls.put(12, new double[]{66.3, 68.9, 71.4, 79.2});
        heightForAgeGirls.put(13, new double[]{67.3, 70, 72.6, 80.5});
        heightForAgeGirls.put(14, new double[]{68.3, 71, 73.7, 81.7});
        heightForAgeGirls.put(15, new double[]{69.3, 72, 74.8, 83});
        heightForAgeGirls.put(16, new double[]{70.2, 73, 75.8, 84.2});
        heightForAgeGirls.put(17, new double[]{71.1, 74, 76.8, 85.4});
        heightForAgeGirls.put(18, new double[]{72, 74.9, 77.8, 86.5});
        heightForAgeGirls.put(19, new double[]{72.8, 75.8, 78.8, 87.6});
        heightForAgeGirls.put(20, new double[]{73.7, 76.7, 79.7, 88.7});
        heightForAgeGirls.put(21, new double[]{74.5, 77.5, 80.6, 89.8});
        heightForAgeGirls.put(22, new double[]{75.2, 78.4, 81.5, 90.8});
        heightForAgeGirls.put(23, new double[]{76, 79.2, 82.3, 91.9});
        heightForAgeGirls.put(24, new double[]{76.7, 80, 83.2, 92.9});
        heightForAgeGirls.put(25, new double[]{76.8, 80, 83.3, 93.1});
        heightForAgeGirls.put(26, new double[]{77.5, 80.8, 84.1, 94.1});
        heightForAgeGirls.put(27, new double[]{78.1, 81.5, 84.9, 95});
        heightForAgeGirls.put(28, new double[]{78.8, 82.2, 85.7, 96});
        heightForAgeGirls.put(29, new double[]{79.5, 82.9, 86.4, 96.9});
        heightForAgeGirls.put(30, new double[]{80.1, 83.6, 87.1, 97.7});
        heightForAgeGirls.put(31, new double[]{80.7, 84.3, 87.9, 98.6});
        heightForAgeGirls.put(32, new double[]{81.3, 84.9, 88.6, 99.4});
        heightForAgeGirls.put(33, new double[]{81.9, 85.6, 89.3, 100.3});
        heightForAgeGirls.put(34, new double[]{82.5, 86.2, 89.9, 101.1});
        heightForAgeGirls.put(35, new double[]{83.1, 86.8, 90.6, 101.9});
        heightForAgeGirls.put(36, new double[]{83.6, 87.4, 91.2, 102.7});
        heightForAgeGirls.put(37, new double[]{84.2, 88, 91.9, 103.4});
        heightForAgeGirls.put(38, new double[]{84.7, 88.6, 92.5, 104.2});
        heightForAgeGirls.put(39, new double[]{85.3, 89.2, 93.1, 105});
        heightForAgeGirls.put(40, new double[]{85.8, 89.8, 93.8, 105.7});
        heightForAgeGirls.put(41, new double[]{86.3, 90.4, 94.4, 106.4});
        heightForAgeGirls.put(42, new double[]{86.8, 90.9, 95, 107.2});
        heightForAgeGirls.put(43, new double[]{87.4, 91.5, 95.6, 107.9});
        heightForAgeGirls.put(44, new double[]{87.9, 92, 96.2, 108.6});
        heightForAgeGirls.put(45, new double[]{88.4, 92.5, 96.7, 109.3});
        heightForAgeGirls.put(46, new double[]{88.9, 93.1, 97.3, 110});
        heightForAgeGirls.put(47, new double[]{89.3, 93.6, 97.9, 110.7});
        heightForAgeGirls.put(48, new double[]{89.8, 94.1, 98.4, 111.3});
        heightForAgeGirls.put(49, new double[]{90.3, 94.6, 99, 112});
        heightForAgeGirls.put(50, new double[]{90.7, 95.1, 99.5, 112.7});
        heightForAgeGirls.put(51, new double[]{91.2, 95.6, 100.1, 113.3});
        heightForAgeGirls.put(52, new double[]{91.7, 96.1, 100.6, 114});
        heightForAgeGirls.put(53, new double[]{92.1, 96.6, 101.1, 114.6});
        heightForAgeGirls.put(54, new double[]{92.6, 97.1, 101.6, 115.2});
        heightForAgeGirls.put(55, new double[]{93, 97.6, 102.2, 115.9});
        heightForAgeGirls.put(56, new double[]{93.4, 98.1, 102.7, 116.5});
        heightForAgeGirls.put(57, new double[]{93.9, 98.5, 103.2, 117.1});
        heightForAgeGirls.put(58, new double[]{94.3, 99, 103.7, 117.7});
        heightForAgeGirls.put(59, new double[]{94.7, 99.5, 104.2, 118.3});
        heightForAgeGirls.put(60, new double[]{95.2, 99.9, 104.7, 118.9});
    }

    public LineGraphSeries<DataPoint> heightForAgeGirlsValues(int pos, int maxMonth) {
        LineGraphSeries<DataPoint> heightforage_series = new LineGraphSeries<DataPoint>();
        for (int i = 0; i <= maxMonth; i++) {
            heightforage_series.appendData(
                    new DataPoint(i, heightForAgeGirls.get(i)[pos]), true, 60);
        }

        heightforage_series.setColor(getColor(pos));
        heightforage_series.setThickness(1);
        heightforage_series.setBackgroundColor(getColor(pos));
        heightforage_series.setDrawBackground(true);
        return heightforage_series;
    }

    public void initializeheightForAgeBoys() {
        heightForAgeBoys.put(0, new double[]{44.2, 46.1, 48, 53.7});
        heightForAgeBoys.put(1, new double[]{48.9, 50.8, 52.8, 58.6});
        heightForAgeBoys.put(2, new double[]{52.4, 54.4, 56.4, 62.4});
        heightForAgeBoys.put(3, new double[]{55.3, 57.3, 59.4, 65.5});
        heightForAgeBoys.put(4, new double[]{57.6, 59.7, 61.8, 68});
        heightForAgeBoys.put(5, new double[]{59.6, 61.7, 63.8, 70.1});
        heightForAgeBoys.put(6, new double[]{61.2, 63.3, 65.5, 71.9});
        heightForAgeBoys.put(7, new double[]{62.7, 64.8, 67, 73.5});
        heightForAgeBoys.put(8, new double[]{64, 66.2, 68.4, 75});
        heightForAgeBoys.put(9, new double[]{65.2, 67.5, 69.7, 76.5});
        heightForAgeBoys.put(10, new double[]{66.4, 68.7, 71, 77.9});
        heightForAgeBoys.put(11, new double[]{67.6, 69.9, 72.2, 79.2});
        heightForAgeBoys.put(12, new double[]{68.6, 71, 73.4, 80.5});
        heightForAgeBoys.put(13, new double[]{69.6, 72.1, 74.5, 81.8});
        heightForAgeBoys.put(14, new double[]{70.6, 73.1, 75.6, 83});
        heightForAgeBoys.put(15, new double[]{71.6, 74.1, 76.6, 84.2});
        heightForAgeBoys.put(16, new double[]{72.5, 75, 77.6, 85.4});
        heightForAgeBoys.put(17, new double[]{73.3, 76, 78.6, 86.5});
        heightForAgeBoys.put(18, new double[]{74.2, 76.9, 79.6, 87.7});
        heightForAgeBoys.put(19, new double[]{75, 77.7, 80.5, 88.8});
        heightForAgeBoys.put(20, new double[]{75.8, 78.6, 81.4, 89.8});
        heightForAgeBoys.put(21, new double[]{76.5, 79.4, 82.3, 90.9});
        heightForAgeBoys.put(22, new double[]{77.2, 80.2, 83.1, 91.9});
        heightForAgeBoys.put(23, new double[]{78, 81, 83.9, 92.9});
        heightForAgeBoys.put(24, new double[]{78, 81, 84.1, 93.2});
        heightForAgeBoys.put(25, new double[]{78.6, 81.7, 84.9, 94.2});
        heightForAgeBoys.put(26, new double[]{79.3, 82.5, 85.6, 95.2});
        heightForAgeBoys.put(27, new double[]{79.9, 83.1, 86.4, 96.1});
        heightForAgeBoys.put(28, new double[]{80.5, 83.8, 87.1, 97});
        heightForAgeBoys.put(29, new double[]{81.1, 84.5, 87.8, 97.9});
        heightForAgeBoys.put(30, new double[]{81.7, 85.1, 88.5, 98.7});
        heightForAgeBoys.put(31, new double[]{82.3, 85.7, 89.2, 99.6});
        heightForAgeBoys.put(32, new double[]{82.8, 86.4, 89.9, 100.4});
        heightForAgeBoys.put(33, new double[]{83.4, 86.9, 90.5, 101.2});
        heightForAgeBoys.put(34, new double[]{83.9, 87.5, 91.1, 102});
        heightForAgeBoys.put(35, new double[]{84.4, 88.1, 91.8, 102.7});
        heightForAgeBoys.put(36, new double[]{85, 88.7, 92.4, 103.5});
        heightForAgeBoys.put(37, new double[]{85.5, 89.2, 93, 104.2});
        heightForAgeBoys.put(38, new double[]{86, 89.8, 93.6, 105});
        heightForAgeBoys.put(39, new double[]{86.5, 90.3, 94.2, 105.7});
        heightForAgeBoys.put(40, new double[]{87, 90.9, 94.7, 106.4});
        heightForAgeBoys.put(41, new double[]{87.5, 91.4, 95.3, 107.1});
        heightForAgeBoys.put(42, new double[]{88, 91.9, 95.9, 107.8});
        heightForAgeBoys.put(43, new double[]{88.4, 92.4, 96.4, 108.5});
        heightForAgeBoys.put(44, new double[]{88.9, 93, 97, 109.1});
        heightForAgeBoys.put(45, new double[]{89.4, 93.5, 97.5, 109.8});
        heightForAgeBoys.put(46, new double[]{89.8, 94, 98.1, 110.4});
        heightForAgeBoys.put(47, new double[]{90.3, 94.4, 98.6, 111.1});
        heightForAgeBoys.put(48, new double[]{90.7, 94.9, 99.1, 111.7});
        heightForAgeBoys.put(49, new double[]{91.2, 95.4, 99.7, 112.4});
        heightForAgeBoys.put(50, new double[]{91.6, 95.9, 100.2, 113});
        heightForAgeBoys.put(51, new double[]{92.1, 96.4, 100.7, 113.6});
        heightForAgeBoys.put(52, new double[]{92.5, 96.9, 101.2, 114.2});
        heightForAgeBoys.put(53, new double[]{93, 97.4, 101.7, 114.9});
        heightForAgeBoys.put(54, new double[]{93.4, 97.8, 102.3, 115.5});
        heightForAgeBoys.put(55, new double[]{93.9, 98.3, 102.8, 116.1});
        heightForAgeBoys.put(56, new double[]{94.3, 98.8, 103.3, 116.7});
        heightForAgeBoys.put(57, new double[]{94.7, 99.3, 103.8, 117.4});
        heightForAgeBoys.put(58, new double[]{95.2, 99.7, 104.3, 118});
        heightForAgeBoys.put(59, new double[]{95.6, 100.2, 104.8, 118.6});
        heightForAgeBoys.put(60, new double[]{96.1, 100.7, 105.3, 119.2});
    }

    public LineGraphSeries<DataPoint> heightForAgeBoysValues(int pos, int maxMonth) {
        LineGraphSeries<DataPoint> heightforage_series = new LineGraphSeries<DataPoint>();
        for (int i = 0; i <= maxMonth; i++) {
            heightforage_series.appendData(
                    new DataPoint(i, heightForAgeBoys.get(i)[pos]), true, 60);
        }

        heightforage_series.setColor(getColor(pos));
        heightforage_series.setThickness(1);
        heightforage_series.setBackgroundColor(getColor(pos));
        heightforage_series.setDrawBackground(true);
        return heightforage_series;
    }

    public void initializeweightForAgeGirls() {
        weightForAgeGirls.put(0, new double[]{2, 2.4, 2.8, 4.2});
        weightForAgeGirls.put(1, new double[]{2.7, 3.2, 3.6, 5.5});
        weightForAgeGirls.put(2, new double[]{3.4, 3.9, 4.5, 6.6});
        weightForAgeGirls.put(3, new double[]{4, 4.5, 5.2, 7.5});
        weightForAgeGirls.put(4, new double[]{4.4, 5, 5.7, 8.2});
        weightForAgeGirls.put(5, new double[]{4.8, 5.4, 6.1, 8.8});
        weightForAgeGirls.put(6, new double[]{5.1, 5.7, 6.5, 9.3});
        weightForAgeGirls.put(7, new double[]{5.3, 6, 6.8, 9.8});
        weightForAgeGirls.put(8, new double[]{5.6, 6.3, 7, 10.2});
        weightForAgeGirls.put(9, new double[]{5.8, 6.5, 7.3, 10.5});
        weightForAgeGirls.put(10, new double[]{5.9, 6.7, 7.5, 10.9});
        weightForAgeGirls.put(11, new double[]{6.1, 6.9, 7.7, 11.2});
        weightForAgeGirls.put(12, new double[]{6.3, 7, 7.9, 11.5});
        weightForAgeGirls.put(13, new double[]{6.4, 7.2, 8.1, 11.8});
        weightForAgeGirls.put(14, new double[]{6.6, 7.4, 8.3, 12.1});
        weightForAgeGirls.put(15, new double[]{6.7, 7.6, 8.5, 12.4});
        weightForAgeGirls.put(16, new double[]{6.9, 7.7, 8.7, 12.6});
        weightForAgeGirls.put(17, new double[]{7, 7.9, 8.9, 12.9});
        weightForAgeGirls.put(18, new double[]{7.2, 8.1, 9.1, 13.2});
        weightForAgeGirls.put(19, new double[]{7.3, 8.2, 9.2, 13.5});
        weightForAgeGirls.put(20, new double[]{7.5, 8.4, 9.4, 13.7});
        weightForAgeGirls.put(21, new double[]{7.6, 8.6, 9.6, 14});
        weightForAgeGirls.put(22, new double[]{7.8, 8.7, 9.8, 14.3});
        weightForAgeGirls.put(23, new double[]{7.9, 8.9, 10, 14.6});
        weightForAgeGirls.put(24, new double[]{8.1, 9, 10.2, 14.8});
        weightForAgeGirls.put(25, new double[]{8.2, 9.2, 10.3, 15.1});
        weightForAgeGirls.put(26, new double[]{8.4, 9.4, 10.5, 15.4});
        weightForAgeGirls.put(27, new double[]{8.5, 9.5, 10.7, 15.7});
        weightForAgeGirls.put(28, new double[]{8.6, 9.7, 10.9, 16});
        weightForAgeGirls.put(29, new double[]{8.8, 9.8, 11.1, 16.2});
        weightForAgeGirls.put(30, new double[]{8.9, 10, 11.2, 16.5});
        weightForAgeGirls.put(31, new double[]{9, 10.1, 11.4, 16.8});
        weightForAgeGirls.put(32, new double[]{9.1, 10.3, 11.6, 17.1});
        weightForAgeGirls.put(33, new double[]{9.3, 10.4, 11.7, 17.3});
        weightForAgeGirls.put(34, new double[]{9.4, 10.5, 11.9, 17.6});
        weightForAgeGirls.put(35, new double[]{9.5, 10.7, 12, 17.9});
        weightForAgeGirls.put(36, new double[]{9.6, 10.8, 12.2, 18.1});
        weightForAgeGirls.put(37, new double[]{9.7, 10.9, 12.4, 18.4});
        weightForAgeGirls.put(38, new double[]{9.8, 11.1, 12.5, 18.7});
        weightForAgeGirls.put(39, new double[]{9.9, 11.2, 12.7, 19});
        weightForAgeGirls.put(40, new double[]{10.1, 11.3, 12.8, 19.2});
        weightForAgeGirls.put(41, new double[]{10.2, 11.5, 13, 19.5});
        weightForAgeGirls.put(42, new double[]{10.3, 11.6, 13.1, 19.8});
        weightForAgeGirls.put(43, new double[]{10.4, 11.7, 13.3, 20.1});
        weightForAgeGirls.put(44, new double[]{10.5, 11.8, 13.4, 20.4});
        weightForAgeGirls.put(45, new double[]{10.6, 12, 13.6, 20.7});
        weightForAgeGirls.put(46, new double[]{10.7, 12.1, 13.7, 20.9});
        weightForAgeGirls.put(47, new double[]{10.8, 12.2, 13.9, 21.2});
        weightForAgeGirls.put(48, new double[]{10.9, 12.3, 14, 21.5});
        weightForAgeGirls.put(49, new double[]{11, 12.4, 14.2, 21.8});
        weightForAgeGirls.put(50, new double[]{11.1, 12.6, 14.3, 22.1});
        weightForAgeGirls.put(51, new double[]{11.2, 12.7, 14.5, 22.4});
        weightForAgeGirls.put(52, new double[]{11.3, 12.8, 14.6, 22.6});
        weightForAgeGirls.put(53, new double[]{11.4, 12.9, 14.8, 22.9});
        weightForAgeGirls.put(54, new double[]{11.5, 13, 14.9, 23.2});
        weightForAgeGirls.put(55, new double[]{11.6, 13.2, 15.1, 23.5});
        weightForAgeGirls.put(56, new double[]{11.7, 13.3, 15.2, 23.8});
        weightForAgeGirls.put(57, new double[]{11.8, 13.4, 15.3, 24.1});
        weightForAgeGirls.put(58, new double[]{11.9, 13.5, 15.5, 24.4});
        weightForAgeGirls.put(59, new double[]{12, 13.6, 15.6, 24.6});
        weightForAgeGirls.put(60, new double[]{12.1, 13.7, 15.8, 24.9});
    }

    public LineGraphSeries<DataPoint> weightForAgeGirlsValues(int pos, int maxMonth) {
        LineGraphSeries<DataPoint> weightforage_series = new LineGraphSeries<DataPoint>();
        for (int i = 0; i <= maxMonth; i++) {
            weightforage_series.appendData(
                    new DataPoint(i, weightForAgeGirls.get(i)[pos]), true, 60);
        }

        weightforage_series.setColor(getColor(pos));
        weightforage_series.setThickness(1);
        weightforage_series.setBackgroundColor(getColor(pos));
        weightforage_series.setDrawBackground(true);
        return weightforage_series;
    }

    public void initializeweightForAgeBoys() {
        weightForAgeBoys.put(0, new double[]{2.1, 2.5, 2.9, 4.4});
        weightForAgeBoys.put(1, new double[]{2.9, 3.4, 3.9, 5.8});
        weightForAgeBoys.put(2, new double[]{3.8, 4.3, 4.9, 7.1});
        weightForAgeBoys.put(3, new double[]{4.4, 5, 5.7, 8});
        weightForAgeBoys.put(4, new double[]{4.9, 5.6, 6.2, 8.7});
        weightForAgeBoys.put(5, new double[]{5.3, 6, 6.7, 9.3});
        weightForAgeBoys.put(6, new double[]{5.7, 6.4, 7.1, 9.8});
        weightForAgeBoys.put(7, new double[]{5.9, 6.7, 7.4, 10.3});
        weightForAgeBoys.put(8, new double[]{6.2, 6.9, 7.7, 10.7});
        weightForAgeBoys.put(9, new double[]{6.4, 7.1, 8, 11});
        weightForAgeBoys.put(10, new double[]{6.6, 7.4, 8.2, 11.4});
        weightForAgeBoys.put(11, new double[]{6.8, 7.6, 8.4, 11.7});
        weightForAgeBoys.put(12, new double[]{6.9, 7.7, 8.6, 12});
        weightForAgeBoys.put(13, new double[]{7.1, 7.9, 8.8, 12.3});
        weightForAgeBoys.put(14, new double[]{7.2, 8.1, 9, 12.6});
        weightForAgeBoys.put(15, new double[]{7.4, 8.3, 9.2, 12.8});
        weightForAgeBoys.put(16, new double[]{7.5, 8.4, 9.4, 13.1});
        weightForAgeBoys.put(17, new double[]{7.7, 8.6, 9.6, 13.4});
        weightForAgeBoys.put(18, new double[]{7.8, 8.8, 9.8, 13.7});
        weightForAgeBoys.put(19, new double[]{8, 8.9, 10, 13.9});
        weightForAgeBoys.put(20, new double[]{8.1, 9.1, 10.1, 14.2});
        weightForAgeBoys.put(21, new double[]{8.2, 9.2, 10.3, 14.5});
        weightForAgeBoys.put(22, new double[]{8.4, 9.4, 10.5, 14.7});
        weightForAgeBoys.put(23, new double[]{8.5, 9.5, 10.7, 15});
        weightForAgeBoys.put(24, new double[]{8.6, 9.7, 10.8, 15.3});
        weightForAgeBoys.put(25, new double[]{8.8, 9.8, 11, 15.5});
        weightForAgeBoys.put(26, new double[]{8.9, 10, 11.2, 15.8});
        weightForAgeBoys.put(27, new double[]{9, 10.1, 11.3, 16.1});
        weightForAgeBoys.put(28, new double[]{9.1, 10.2, 11.5, 16.3});
        weightForAgeBoys.put(29, new double[]{9.2, 10.4, 11.7, 16.6});
        weightForAgeBoys.put(30, new double[]{9.4, 10.5, 11.8, 16.9});
        weightForAgeBoys.put(31, new double[]{9.5, 10.7, 12, 17.1});
        weightForAgeBoys.put(32, new double[]{9.6, 10.8, 12.1, 17.4});
        weightForAgeBoys.put(33, new double[]{9.7, 10.9, 12.3, 17.6});
        weightForAgeBoys.put(34, new double[]{9.8, 11, 12.4, 17.8});
        weightForAgeBoys.put(35, new double[]{9.9, 11.2, 12.6, 18.1});
        weightForAgeBoys.put(36, new double[]{10, 11.3, 12.7, 18.3});
        weightForAgeBoys.put(37, new double[]{10.1, 11.4, 12.9, 18.6});
        weightForAgeBoys.put(38, new double[]{10.2, 11.5, 13, 18.8});
        weightForAgeBoys.put(39, new double[]{10.3, 11.6, 13.1, 19});
        weightForAgeBoys.put(40, new double[]{10.4, 11.8, 13.3, 19.3});
        weightForAgeBoys.put(41, new double[]{10.5, 11.9, 13.4, 19.5});
        weightForAgeBoys.put(42, new double[]{10.6, 12, 13.6, 19.7});
        weightForAgeBoys.put(43, new double[]{10.7, 12.1, 13.7, 20});
        weightForAgeBoys.put(44, new double[]{10.8, 12.2, 13.8, 20.2});
        weightForAgeBoys.put(45, new double[]{10.9, 12.4, 14, 20.5});
        weightForAgeBoys.put(46, new double[]{11, 12.5, 14.1, 20.7});
        weightForAgeBoys.put(47, new double[]{11.1, 12.6, 14.3, 20.9});
        weightForAgeBoys.put(48, new double[]{11.2, 12.7, 14.4, 21.2});
        weightForAgeBoys.put(49, new double[]{11.3, 12.8, 14.5, 21.4});
        weightForAgeBoys.put(50, new double[]{11.4, 12.9, 14.7, 21.7});
        weightForAgeBoys.put(51, new double[]{11.5, 13.1, 14.8, 21.9});
        weightForAgeBoys.put(52, new double[]{11.6, 13.2, 15, 22.2});
        weightForAgeBoys.put(53, new double[]{11.7, 13.3, 15.1, 22.4});
        weightForAgeBoys.put(54, new double[]{11.8, 13.4, 15.2, 22.7});
        weightForAgeBoys.put(55, new double[]{11.9, 13.5, 15.4, 22.9});
        weightForAgeBoys.put(56, new double[]{12, 13.6, 15.5, 23.2});
        weightForAgeBoys.put(57, new double[]{12.1, 13.7, 15.6, 23.4});
        weightForAgeBoys.put(58, new double[]{12.2, 13.8, 15.8, 23.7});
        weightForAgeBoys.put(59, new double[]{12.3, 14, 15.9, 23.9});
        weightForAgeBoys.put(60, new double[]{12.4, 14.1, 16, 24.2});
    }

    public LineGraphSeries<DataPoint> weightForAgeBoys(int pos, int maxMonth) {
        LineGraphSeries<DataPoint> weightforage_series = new LineGraphSeries<DataPoint>();
        for (int i = 0; i <= maxMonth; i++) {
            weightforage_series.appendData(
                    new DataPoint(i, weightForAgeBoys.get(i)[pos]), true, 60);
        }

        weightforage_series.setColor(getColor(pos));
        weightforage_series.setThickness(1);
        weightforage_series.setBackgroundColor(getColor(pos));
        weightforage_series.setDrawBackground(true);
        return weightforage_series;
    }

    public void initializweightForHeightBoys0To2() {
        weightForHeightBoys0to2.put(45, new double[] {1.9,2,2.2,2.4,2.7,3,3.3});
        weightForHeightBoys0to2.put(45.5, new double[] {1.9,2.1,2.3,2.5,2.8,3.1,3.4});
        weightForHeightBoys0to2.put(46, new double[] {2,2.2,2.4,2.6,2.9,3.1,3.5});
        weightForHeightBoys0to2.put(46.5, new double[] {2.1,2.3,2.5,2.7,3,3.2,3.6});
        weightForHeightBoys0to2.put(47, new double[] {2.1,2.3,2.5,2.8,3,3.3,3.7});
        weightForHeightBoys0to2.put(47.5, new double[] {2.2,2.4,2.6,2.9,3.1,3.4,3.8});
        weightForHeightBoys0to2.put(48, new double[] {2.3,2.5,2.7,2.9,3.2,3.6,3.9});
        weightForHeightBoys0to2.put(48.5, new double[] {2.3,2.6,2.8,3,3.3,3.7,4});
        weightForHeightBoys0to2.put(49, new double[] {2.4,2.6,2.9,3.1,3.4,3.8,4.2});
        weightForHeightBoys0to2.put(49.5, new double[] {2.5,2.7,3,3.2,3.5,3.9,4.3});
        weightForHeightBoys0to2.put(50, new double[] {2.6,2.8,3,3.3,3.6,4,4.4});
        weightForHeightBoys0to2.put(50.5, new double[] {2.7,2.9,3.1,3.4,3.8,4.1,4.5});
        weightForHeightBoys0to2.put(51, new double[] {2.7,3,3.2,3.5,3.9,4.2,4.7});
        weightForHeightBoys0to2.put(51.5, new double[] {2.8,3.1,3.3,3.6,4,4.4,4.8});
        weightForHeightBoys0to2.put(52, new double[] {2.9,3.2,3.5,3.8,4.1,4.5,5});
        weightForHeightBoys0to2.put(52.5, new double[] {3,3.3,3.6,3.9,4.2,4.6,5.1});
        weightForHeightBoys0to2.put(53, new double[] {3.1,3.4,3.7,4,4.4,4.8,5.3});
        weightForHeightBoys0to2.put(53.5, new double[] {3.2,3.5,3.8,4.1,4.5,4.9,5.4});
        weightForHeightBoys0to2.put(54, new double[] {3.3,3.6,3.9,4.3,4.7,5.1,5.6});
        weightForHeightBoys0to2.put(54.5, new double[] {3.4,3.7,4,4.4,4.8,5.3,5.8});
        weightForHeightBoys0to2.put(55, new double[] {3.6,3.8,4.2,4.5,5,5.4,6});
        weightForHeightBoys0to2.put(55.5, new double[] {3.7,4,4.3,4.7,5.1,5.6,6.1});
        weightForHeightBoys0to2.put(56, new double[] {3.8,4.1,4.4,4.8,5.3,5.8,6.3});
        weightForHeightBoys0to2.put(56.5, new double[] {3.9,4.2,4.6,5,5.4,5.9,6.5});
        weightForHeightBoys0to2.put(57, new double[] {4,4.3,4.7,5.1,5.6,6.1,6.7});
        weightForHeightBoys0to2.put(57.5, new double[] {4.1,4.5,4.9,5.3,5.7,6.3,6.9});
        weightForHeightBoys0to2.put(58, new double[] {4.3,4.6,5,5.4,5.9,6.4,7.1});
        weightForHeightBoys0to2.put(58.5, new double[] {4.4,4.7,5.1,5.6,6.1,6.6,7.2});
        weightForHeightBoys0to2.put(59, new double[] {4.5,4.8,5.3,5.7,6.2,6.8,7.4});
        weightForHeightBoys0to2.put(59.5, new double[] {4.6,5,5.4,5.9,6.4,7,7.6});
        weightForHeightBoys0to2.put(60, new double[] {4.7,5.1,5.5,6,6.5,7.1,7.8});
        weightForHeightBoys0to2.put(60.5, new double[] {4.8,5.2,5.6,6.1,6.7,7.3,8});
        weightForHeightBoys0to2.put(61, new double[] {4.9,5.3,5.8,6.3,6.8,7.4,8.1});
        weightForHeightBoys0to2.put(61.5, new double[] {5,5.4,5.9,6.4,7,7.6,8.3});
        weightForHeightBoys0to2.put(62, new double[] {5.1,5.6,6,6.5,7.1,7.7,8.5});
        weightForHeightBoys0to2.put(62.5, new double[] {5.2,5.7,6.1,6.7,7.2,7.9,8.6});
        weightForHeightBoys0to2.put(63, new double[] {5.3,5.8,6.2,6.8,7.4,8,8.8});
        weightForHeightBoys0to2.put(63.5, new double[] {5.4,5.9,6.4,6.9,7.5,8.2,8.9});
        weightForHeightBoys0to2.put(64, new double[] {5.5,6,6.5,7,7.6,8.3,9.1});
        weightForHeightBoys0to2.put(64.5, new double[] {5.6,6.1,6.6,7.1,7.8,8.5,9.3});
        weightForHeightBoys0to2.put(65, new double[] {5.7,6.2,6.7,7.3,7.9,8.6,9.4});
        weightForHeightBoys0to2.put(65.5, new double[] {5.8,6.3,6.8,7.4,8,8.7,9.6});
        weightForHeightBoys0to2.put(66, new double[] {5.9,6.4,6.9,7.5,8.2,8.9,9.7});
        weightForHeightBoys0to2.put(66.5, new double[] {6,6.5,7,7.6,8.3,9,9.9});
        weightForHeightBoys0to2.put(67, new double[] {6.1,6.6,7.1,7.7,8.4,9.2,10});
        weightForHeightBoys0to2.put(67.5, new double[] {6.2,6.7,7.2,7.9,8.5,9.3,10.2});
        weightForHeightBoys0to2.put(68, new double[] {6.3,6.8,7.3,8,8.7,9.4,10.3});
        weightForHeightBoys0to2.put(68.5, new double[] {6.4,6.9,7.5,8.1,8.8,9.6,10.5});
        weightForHeightBoys0to2.put(69, new double[] {6.5,7,7.6,8.2,8.9,9.7,10.6});
        weightForHeightBoys0to2.put(69.5, new double[] {6.6,7.1,7.7,8.3,9,9.8,10.8});
        weightForHeightBoys0to2.put(70, new double[] {6.6,7.2,7.8,8.4,9.2,10,10.9});
        weightForHeightBoys0to2.put(70.5, new double[] {6.7,7.3,7.9,8.5,9.3,10.1,11.1});
        weightForHeightBoys0to2.put(71, new double[] {6.8,7.4,8,8.6,9.4,10.2,11.2});
        weightForHeightBoys0to2.put(71.5, new double[] {6.9,7.5,8.1,8.8,9.5,10.4,11.3});
        weightForHeightBoys0to2.put(72, new double[] {7,7.6,8.2,8.9,9.6,10.5,11.5});
        weightForHeightBoys0to2.put(72.5, new double[] {7.1,7.6,8.3,9,9.8,10.6,11.6});
        weightForHeightBoys0to2.put(73, new double[] {7.2,7.7,8.4,9.1,9.9,10.8,11.8});
        weightForHeightBoys0to2.put(73.5, new double[] {7.2,7.8,8.5,9.2,10,10.9,11.9});
        weightForHeightBoys0to2.put(74, new double[] {7.3,7.9,8.6,9.3,10.1,11,12.1});
        weightForHeightBoys0to2.put(74.5, new double[] {7.4,8,8.7,9.4,10.2,11.2,12.2});
        weightForHeightBoys0to2.put(75, new double[] {7.5,8.1,8.8,9.5,10.3,11.3,12.3});
        weightForHeightBoys0to2.put(75.5, new double[] {7.6,8.2,8.8,9.6,10.4,11.4,12.5});
        weightForHeightBoys0to2.put(76, new double[] {7.6,8.3,8.9,9.7,10.6,11.5,12.6});
        weightForHeightBoys0to2.put(76.5, new double[] {7.7,8.3,9,9.8,10.7,11.6,12.7});
        weightForHeightBoys0to2.put(77, new double[] {7.8,8.4,9.1,9.9,10.8,11.7,12.8});
        weightForHeightBoys0to2.put(77.5, new double[] {7.9,8.5,9.2,10,10.9,11.9,13});
        weightForHeightBoys0to2.put(78, new double[] {7.9,8.6,9.3,10.1,11,12,13.1});
        weightForHeightBoys0to2.put(78.5, new double[] {8,8.7,9.4,10.2,11.1,12.1,13.2});
        weightForHeightBoys0to2.put(79, new double[] {8.1,8.7,9.5,10.3,11.2,12.2,13.3});
        weightForHeightBoys0to2.put(79.5, new double[] {8.2,8.8,9.5,10.4,11.3,12.3,13.4});
        weightForHeightBoys0to2.put(80, new double[] {8.2,8.9,9.6,10.4,11.4,12.4,13.6});
        weightForHeightBoys0to2.put(80.5, new double[] {8.3,9,9.7,10.5,11.5,12.5,13.7});
        weightForHeightBoys0to2.put(81, new double[] {8.4,9.1,9.8,10.6,11.6,12.6,13.8});
        weightForHeightBoys0to2.put(81.5, new double[] {8.5,9.1,9.9,10.7,11.7,12.7,13.9});
        weightForHeightBoys0to2.put(82, new double[] {8.5,9.2,10,10.8,11.8,12.8,14});
        weightForHeightBoys0to2.put(82.5, new double[] {8.6,9.3,10.1,10.9,11.9,13,14.2});
        weightForHeightBoys0to2.put(83, new double[] {8.7,9.4,10.2,11,12,13.1,14.3});
        weightForHeightBoys0to2.put(83.5, new double[] {8.8,9.5,10.3,11.2,12.1,13.2,14.4});
        weightForHeightBoys0to2.put(84, new double[] {8.9,9.6,10.4,11.3,12.2,13.3,14.6});
        weightForHeightBoys0to2.put(84.5, new double[] {9,9.7,10.5,11.4,12.4,13.5,14.7});
        weightForHeightBoys0to2.put(85, new double[] {9.1,9.8,10.6,11.5,12.5,13.6,14.9});
        weightForHeightBoys0to2.put(85.5, new double[] {9.2,9.9,10.7,11.6,12.6,13.7,15});
        weightForHeightBoys0to2.put(86, new double[] {9.3,10,10.8,11.7,12.8,13.9,15.2});
        weightForHeightBoys0to2.put(86.5, new double[] {9.4,10.1,11,11.9,12.9,14,15.3});
        weightForHeightBoys0to2.put(87, new double[] {9.5,10.2,11.1,12,13,14.2,15.5});
        weightForHeightBoys0to2.put(87.5, new double[] {9.6,10.4,11.2,12.1,13.2,14.3,15.6});
        weightForHeightBoys0to2.put(88, new double[] {9.7,10.5,11.3,12.2,13.3,14.5,15.8});
        weightForHeightBoys0to2.put(88.5, new double[] {9.8,10.6,11.4,12.4,13.4,14.6,15.9});
        weightForHeightBoys0to2.put(89, new double[] {9.9,10.7,11.5,12.5,13.5,14.7,16.1});
        weightForHeightBoys0to2.put(89.5, new double[] {10,10.8,11.6,12.6,13.7,14.9,16.2});
        weightForHeightBoys0to2.put(90, new double[] {10.1,10.9,11.8,12.7,13.8,15,16.4});
        weightForHeightBoys0to2.put(90.5, new double[] {10.2,11,11.9,12.8,13.9,15.1,16.5});
        weightForHeightBoys0to2.put(91, new double[] {10.3,11.1,12,13,14.1,15.3,16.7});
        weightForHeightBoys0to2.put(91.5, new double[] {10.4,11.2,12.1,13.1,14.2,15.4,16.8});
        weightForHeightBoys0to2.put(92, new double[] {10.5,11.3,12.2,13.2,14.3,15.6,17});
        weightForHeightBoys0to2.put(92.5, new double[] {10.6,11.4,12.3,13.3,14.4,15.7,17.1});
        weightForHeightBoys0to2.put(93, new double[] {10.7,11.5,12.4,13.4,14.6,15.8,17.3});
        weightForHeightBoys0to2.put(93.5, new double[] {10.7,11.6,12.5,13.5,14.7,16,17.4});
        weightForHeightBoys0to2.put(94, new double[] {10.8,11.7,12.6,13.7,14.8,16.1,17.6});
        weightForHeightBoys0to2.put(94.5, new double[] {10.9,11.8,12.7,13.8,14.9,16.3,17.7});
        weightForHeightBoys0to2.put(95, new double[] {11,11.9,12.8,13.9,15.1,16.4,17.9});
        weightForHeightBoys0to2.put(95.5, new double[] {11.1,12,12.9,14,15.2,16.5,18});
        weightForHeightBoys0to2.put(96, new double[] {11.2,12.1,13.1,14.1,15.3,16.7,18.2});
        weightForHeightBoys0to2.put(96.5, new double[] {11.3,12.2,13.2,14.3,15.5,16.8,18.4});
        weightForHeightBoys0to2.put(97, new double[] {11.4,12.3,13.3,14.4,15.6,17,18.5});
        weightForHeightBoys0to2.put(97.5, new double[] {11.5,12.4,13.4,14.5,15.7,17.1,18.7});
        weightForHeightBoys0to2.put(98, new double[] {11.6,12.5,13.5,14.6,15.9,17.3,18.9});
        weightForHeightBoys0to2.put(98.5, new double[] {11.7,12.6,13.6,14.8,16,17.5,19.1});
        weightForHeightBoys0to2.put(99, new double[] {11.8,12.7,13.7,14.9,16.2,17.6,19.2});
        weightForHeightBoys0to2.put(99.5, new double[] {11.9,12.8,13.9,15,16.3,17.8,19.4});
        weightForHeightBoys0to2.put(100, new double[] {12,12.9,14,15.2,16.5,18,19.6});
        weightForHeightBoys0to2.put(100.5, new double[] {12.1,13,14.1,15.3,16.6,18.1,19.8});
        weightForHeightBoys0to2.put(101, new double[] {12.2,13.2,14.2,15.4,16.8,18.3,20});
        weightForHeightBoys0to2.put(101.5, new double[] {12.3,13.3,14.4,15.6,16.9,18.5,20.2});
        weightForHeightBoys0to2.put(102, new double[] {12.4,13.4,14.5,15.7,17.1,18.7,20.4});
        weightForHeightBoys0to2.put(102.5, new double[] {12.5,13.5,14.6,15.9,17.3,18.8,20.6});
        weightForHeightBoys0to2.put(103, new double[] {12.6,13.6,14.8,16,17.4,19,20.8});
        weightForHeightBoys0to2.put(103.5, new double[] {12.7,13.7,14.9,16.2,17.6,19.2,21});
        weightForHeightBoys0to2.put(104, new double[] {12.8,13.9,15,16.3,17.8,19.4,21.2});
        weightForHeightBoys0to2.put(104.5, new double[] {12.9,14,15.2,16.5,17.9,19.6,21.5});
        weightForHeightBoys0to2.put(105, new double[] {13,14.1,15.3,16.6,18.1,19.8,21.7});
        weightForHeightBoys0to2.put(105.5, new double[] {13.2,14.2,15.4,16.8,18.3,20,21.9});
        weightForHeightBoys0to2.put(106, new double[] {13.3,14.4,15.6,16.9,18.5,20.2,22.1});
        weightForHeightBoys0to2.put(106.5, new double[] {13.4,14.5,15.7,17.1,18.6,20.4,22.4});
        weightForHeightBoys0to2.put(107, new double[] {13.5,14.6,15.9,17.3,18.8,20.6,22.6});
        weightForHeightBoys0to2.put(107.5, new double[] {13.6,14.7,16,17.4,19,20.8,22.8});
        weightForHeightBoys0to2.put(108, new double[] {13.7,14.9,16.2,17.6,19.2,21,23.1});
        weightForHeightBoys0to2.put(108.5, new double[] {13.8,15,16.3,17.8,19.4,21.2,23.3});
        weightForHeightBoys0to2.put(109, new double[] {14,15.1,16.5,17.9,19.6,21.4,23.6});
        weightForHeightBoys0to2.put(109.5, new double[] {14.1,15.3,16.6,18.1,19.8,21.7,23.8});
        weightForHeightBoys0to2.put(110, new double[] {14.2,15.4,16.8,18.3,20,21.9,24.1});

    }

    public LineGraphSeries<DataPoint> weightForHeightBoys0to2(int pos, int maxMonth) {
        LineGraphSeries<DataPoint> weightForHeightBoys0to2_series = new LineGraphSeries<DataPoint>();
        for (int i = 0; i <= maxMonth; i++) {
            weightForHeightBoys0to2_series.appendData(
                    new DataPoint(i, weightForHeightBoys0to2.get(i)[pos]), true, 60);
        }

        weightForHeightBoys0to2_series.setColor(getColor(pos));
        weightForHeightBoys0to2_series.setThickness(1);
        weightForHeightBoys0to2_series.setBackgroundColor(getColor(pos));
        weightForHeightBoys0to2_series.setDrawBackground(true);
        return weightForHeightBoys0to2_series;
    }

    public void initializweightForHeightBoys2To5() {

        weightForHeightBoys2to5.put(65, new double[] {5.9,6.3,6.9,7.4,8.1,8.8,9.6});
        weightForHeightBoys2to5.put(65.5, new double[] {6,6.4,7,7.6,8.2,8.9,9.8});
        weightForHeightBoys2to5.put(66, new double[] {6.1,6.5,7.1,7.7,8.3,9.1,9.9});
        weightForHeightBoys2to5.put(66.5, new double[] {6.1,6.6,7.2,7.8,8.5,9.2,10.1});
        weightForHeightBoys2to5.put(67, new double[] {6.2,6.7,7.3,7.9,8.6,9.4,10.2});
        weightForHeightBoys2to5.put(67.5, new double[] {6.3,6.8,7.4,8,8.7,9.5,10.4});
        weightForHeightBoys2to5.put(68, new double[] {6.4,6.9,7.5,8.1,8.8,9.6,10.5});
        weightForHeightBoys2to5.put(68.5, new double[] {6.5,7,7.6,8.2,9,9.8,10.7});
        weightForHeightBoys2to5.put(69, new double[] {6.6,7.1,7.7,8.4,9.1,9.9,10.8});
        weightForHeightBoys2to5.put(69.5, new double[] {6.7,7.2,7.8,8.5,9.2,10,11});
        weightForHeightBoys2to5.put(70, new double[] {6.8,7.3,7.9,8.6,9.3,10.2,11.1});
        weightForHeightBoys2to5.put(70.5, new double[] {6.9,7.4,8,8.7,9.5,10.3,11.3});
        weightForHeightBoys2to5.put(71, new double[] {6.9,7.5,8.1,8.8,9.6,10.4,11.4});
        weightForHeightBoys2to5.put(71.5, new double[] {7,7.6,8.2,8.9,9.7,10.6,11.6});
        weightForHeightBoys2to5.put(72, new double[] {7.1,7.7,8.3,9,9.8,10.7,11.7});
        weightForHeightBoys2to5.put(72.5, new double[] {7.2,7.8,8.4,9.1,9.9,10.8,11.8});
        weightForHeightBoys2to5.put(73, new double[] {7.3,7.9,8.5,9.2,10,11,12});
        weightForHeightBoys2to5.put(73.5, new double[] {7.4,7.9,8.6,9.3,10.2,11.1,12.1});
        weightForHeightBoys2to5.put(74, new double[] {7.4,8,8.7,9.4,10.3,11.2,12.2});
        weightForHeightBoys2to5.put(74.5, new double[] {7.5,8.1,8.8,9.5,10.4,11.3,12.4});
        weightForHeightBoys2to5.put(75, new double[] {7.6,8.2,8.9,9.6,10.5,11.4,12.5});
        weightForHeightBoys2to5.put(75.5, new double[] {7.7,8.3,9,9.7,10.6,11.6,12.6});
        weightForHeightBoys2to5.put(76, new double[] {7.7,8.4,9.1,9.8,10.7,11.7,12.8});
        weightForHeightBoys2to5.put(76.5, new double[] {7.8,8.5,9.2,9.9,10.8,11.8,12.9});
        weightForHeightBoys2to5.put(77, new double[] {7.9,8.5,9.2,10,10.9,11.9,13});
        weightForHeightBoys2to5.put(77.5, new double[] {8,8.6,9.3,10.1,11,12,13.1});
        weightForHeightBoys2to5.put(78, new double[] {8,8.7,9.4,10.2,11.1,12.1,13.3});
        weightForHeightBoys2to5.put(78.5, new double[] {8.1,8.8,9.5,10.3,11.2,12.2,13.4});
        weightForHeightBoys2to5.put(79, new double[] {8.2,8.8,9.6,10.4,11.3,12.3,13.5});
        weightForHeightBoys2to5.put(79.5, new double[] {8.3,8.9,9.7,10.5,11.4,12.4,13.6});
        weightForHeightBoys2to5.put(80, new double[] {8.3,9,9.7,10.6,11.5,12.6,13.7});
        weightForHeightBoys2to5.put(80.5, new double[] {8.4,9.1,9.8,10.7,11.6,12.7,13.8});
        weightForHeightBoys2to5.put(81, new double[] {8.5,9.2,9.9,10.8,11.7,12.8,14});
        weightForHeightBoys2to5.put(81.5, new double[] {8.6,9.3,10,10.9,11.8,12.9,14.1});
        weightForHeightBoys2to5.put(82, new double[] {8.7,9.3,10.1,11,11.9,13,14.2});
        weightForHeightBoys2to5.put(82.5, new double[] {8.7,9.4,10.2,11.1,12.1,13.1,14.4});
        weightForHeightBoys2to5.put(83, new double[] {8.8,9.5,10.3,11.2,12.2,13.3,14.5});
        weightForHeightBoys2to5.put(83.5, new double[] {8.9,9.6,10.4,11.3,12.3,13.4,14.6});
        weightForHeightBoys2to5.put(84, new double[] {9,9.7,10.5,11.4,12.4,13.5,14.8});
        weightForHeightBoys2to5.put(84.5, new double[] {9.1,9.9,10.7,11.5,12.5,13.7,14.9});
        weightForHeightBoys2to5.put(85, new double[] {9.2,10,10.8,11.7,12.7,13.8,15.1});
        weightForHeightBoys2to5.put(85.5, new double[] {9.3,10.1,10.9,11.8,12.8,13.9,15.2});
        weightForHeightBoys2to5.put(86, new double[] {9.4,10.2,11,11.9,12.9,14.1,15.4});
        weightForHeightBoys2to5.put(86.5, new double[] {9.5,10.3,11.1,12,13.1,14.2,15.5});
        weightForHeightBoys2to5.put(87, new double[] {9.6,10.4,11.2,12.2,13.2,14.4,15.7});
        weightForHeightBoys2to5.put(87.5, new double[] {9.7,10.5,11.3,12.3,13.3,14.5,15.8});
        weightForHeightBoys2to5.put(88, new double[] {9.8,10.6,11.5,12.4,13.5,14.7,16});
        weightForHeightBoys2to5.put(88.5, new double[] {9.9,10.7,11.6,12.5,13.6,14.8,16.1});
        weightForHeightBoys2to5.put(89, new double[] {10,10.8,11.7,12.6,13.7,14.9,16.3});
        weightForHeightBoys2to5.put(89.5, new double[] {10.1,10.9,11.8,12.8,13.9,15.1,16.4});
        weightForHeightBoys2to5.put(90, new double[] {10.2,11,11.9,12.9,14,15.2,16.6});
        weightForHeightBoys2to5.put(90.5, new double[] {10.3,11.1,12,13,14.1,15.3,16.7});
        weightForHeightBoys2to5.put(91, new double[] {10.4,11.2,12.1,13.1,14.2,15.5,16.9});
        weightForHeightBoys2to5.put(91.5, new double[] {10.5,11.3,12.2,13.2,14.4,15.6,17});
        weightForHeightBoys2to5.put(92, new double[] {10.6,11.4,12.3,13.4,14.5,15.8,17.2});
        weightForHeightBoys2to5.put(92.5, new double[] {10.7,11.5,12.4,13.5,14.6,15.9,17.3});
        weightForHeightBoys2to5.put(93, new double[] {10.8,11.6,12.6,13.6,14.7,16,17.5});
        weightForHeightBoys2to5.put(93.5, new double[] {10.9,11.7,12.7,13.7,14.9,16.2,17.6});
        weightForHeightBoys2to5.put(94, new double[] {11,11.8,12.8,13.8,15,16.3,17.8});
        weightForHeightBoys2to5.put(94.5, new double[] {11.1,11.9,12.9,13.9,15.1,16.5,17.9});
        weightForHeightBoys2to5.put(95, new double[] {11.1,12,13,14.1,15.3,16.6,18.1});
        weightForHeightBoys2to5.put(95.5, new double[] {11.2,12.1,13.1,14.2,15.4,16.7,18.3});
        weightForHeightBoys2to5.put(96, new double[] {11.3,12.2,13.2,14.3,15.5,16.9,18.4});
        weightForHeightBoys2to5.put(96.5, new double[] {11.4,12.3,13.3,14.4,15.7,17,18.6});
        weightForHeightBoys2to5.put(97, new double[] {11.5,12.4,13.4,14.6,15.8,17.2,18.8});
        weightForHeightBoys2to5.put(97.5, new double[] {11.6,12.5,13.6,14.7,15.9,17.4,18.9});
        weightForHeightBoys2to5.put(98, new double[] {11.7,12.6,13.7,14.8,16.1,17.5,19.1});
        weightForHeightBoys2to5.put(98.5, new double[] {11.8,12.8,13.8,14.9,16.2,17.7,19.3});
        weightForHeightBoys2to5.put(99, new double[] {11.9,12.9,13.9,15.1,16.4,17.9,19.5});
        weightForHeightBoys2to5.put(99.5, new double[] {12,13,14,15.2,16.5,18,19.7});
        weightForHeightBoys2to5.put(100, new double[] {12.1,13.1,14.2,15.4,16.7,18.2,19.9});
        weightForHeightBoys2to5.put(100.5, new double[] {12.2,13.2,14.3,15.5,16.9,18.4,20.1});
        weightForHeightBoys2to5.put(101, new double[] {12.3,13.3,14.4,15.6,17,18.5,20.3});
        weightForHeightBoys2to5.put(101.5, new double[] {12.4,13.4,14.5,15.8,17.2,18.7,20.5});
        weightForHeightBoys2to5.put(102, new double[] {12.5,13.6,14.7,15.9,17.3,18.9,20.7});
        weightForHeightBoys2to5.put(102.5, new double[] {12.6,13.7,14.8,16.1,17.5,19.1,20.9});
        weightForHeightBoys2to5.put(103, new double[] {12.8,13.8,14.9,16.2,17.7,19.3,21.1});
        weightForHeightBoys2to5.put(103.5, new double[] {12.9,13.9,15.1,16.4,17.8,19.5,21.3});
        weightForHeightBoys2to5.put(104, new double[] {13,14,15.2,16.5,18,19.7,21.6});
        weightForHeightBoys2to5.put(104.5, new double[] {13.1,14.2,15.4,16.7,18.2,19.9,21.8});
        weightForHeightBoys2to5.put(105, new double[] {13.2,14.3,15.5,16.8,18.4,20.1,22});
        weightForHeightBoys2to5.put(105.5, new double[] {13.3,14.4,15.6,17,18.5,20.3,22.2});
        weightForHeightBoys2to5.put(106, new double[] {13.4,14.5,15.8,17.2,18.7,20.5,22.5});
        weightForHeightBoys2to5.put(106.5, new double[] {13.5,14.7,15.9,17.3,18.9,20.7,22.7});
        weightForHeightBoys2to5.put(107, new double[] {13.7,14.8,16.1,17.5,19.1,20.9,22.9});
        weightForHeightBoys2to5.put(107.5, new double[] {13.8,14.9,16.2,17.7,19.3,21.1,23.2});
        weightForHeightBoys2to5.put(108, new double[] {13.9,15.1,16.4,17.8,19.5,21.3,23.4});
        weightForHeightBoys2to5.put(108.5, new double[] {14,15.2,16.5,18,19.7,21.5,23.7});
        weightForHeightBoys2to5.put(109, new double[] {14.1,15.3,16.7,18.2,19.8,21.8,23.9});
        weightForHeightBoys2to5.put(109.5, new double[] {14.3,15.5,16.8,18.3,20,22,24.2});
        weightForHeightBoys2to5.put(110, new double[] {14.4,15.6,17,18.5,20.2,22.2,24.4});
        weightForHeightBoys2to5.put(110.5, new double[] {14.5,15.8,17.1,18.7,20.4,22.4,24.7});
        weightForHeightBoys2to5.put(111, new double[] {14.6,15.9,17.3,18.9,20.7,22.7,25});
        weightForHeightBoys2to5.put(111.5, new double[] {14.8,16,17.5,19.1,20.9,22.9,25.2});
        weightForHeightBoys2to5.put(112, new double[] {14.9,16.2,17.6,19.2,21.1,23.1,25.5});
        weightForHeightBoys2to5.put(112.5, new double[] {15,16.3,17.8,19.4,21.3,23.4,25.8});
        weightForHeightBoys2to5.put(113, new double[] {15.2,16.5,18,19.6,21.5,23.6,26});
        weightForHeightBoys2to5.put(113.5, new double[] {15.3,16.6,18.1,19.8,21.7,23.9,26.3});
        weightForHeightBoys2to5.put(114, new double[] {15.4,16.8,18.3,20,21.9,24.1,26.6});
        weightForHeightBoys2to5.put(114.5, new double[] {15.6,16.9,18.5,20.2,22.1,24.4,26.9});
        weightForHeightBoys2to5.put(115, new double[] {15.7,17.1,18.6,20.4,22.4,24.6,27.2});
        weightForHeightBoys2to5.put(115.5, new double[] {15.8,17.2,18.8,20.6,22.6,24.9,27.5});
        weightForHeightBoys2to5.put(116, new double[] {16,17.4,19,20.8,22.8,25.1,27.8});
        weightForHeightBoys2to5.put(116.5, new double[] {16.1,17.5,19.2,21,23,25.4,28});
        weightForHeightBoys2to5.put(117, new double[] {16.2,17.7,19.3,21.2,23.3,25.6,28.3});
        weightForHeightBoys2to5.put(117.5, new double[] {16.4,17.9,19.5,21.4,23.5,25.9,28.6});
        weightForHeightBoys2to5.put(118, new double[] {16.5,18,19.7,21.6,23.7,26.1,28.9});
        weightForHeightBoys2to5.put(118.5, new double[] {16.7,18.2,19.9,21.8,23.9,26.4,29.2});
        weightForHeightBoys2to5.put(119, new double[] {16.8,18.3,20,22,24.1,26.6,29.5});
        weightForHeightBoys2to5.put(119.5, new double[] {16.9,18.5,20.2,22.2,24.4,26.9,29.8});
        weightForHeightBoys2to5.put(120, new double[] {17.1,18.6,20.4,22.4,24.6,27.2,30.1});

    }

    public LineGraphSeries<DataPoint> weightForHeightBoys2to5(int pos, int maxMonth) {
        LineGraphSeries<DataPoint> weightForHeightBoys2to5_series = new LineGraphSeries<DataPoint>();
        for (int i = 0; i <= maxMonth; i++) {
            weightForHeightBoys2to5_series.appendData(
                    new DataPoint(i, weightForHeightBoys2to5.get(i)[pos]), true, 60);
        }

        weightForHeightBoys2to5_series.setColor(getColor(pos));
        weightForHeightBoys2to5_series.setThickness(1);
        weightForHeightBoys2to5_series.setBackgroundColor(getColor(pos));
        weightForHeightBoys2to5_series.setDrawBackground(true);
        return weightForHeightBoys2to5_series;
    }

    public void initializweightForHeightGirls0to2() {
        weightForHeightGirls0to2.put(45, new double[] {1.9,2.1,2.3,2.5,2.7,3,3.3});
        weightForHeightGirls0to2.put(45.5, new double[] {2,2.1,2.3,2.5,2.8,3.1,3.4});
        weightForHeightGirls0to2.put(46, new double[] {2,2.2,2.4,2.6,2.9,3.2,3.5});
        weightForHeightGirls0to2.put(46.5, new double[] {2.1,2.3,2.5,2.7,3,3.3,3.6});
        weightForHeightGirls0to2.put(47, new double[] {2.2,2.4,2.6,2.8,3.1,3.4,3.7});
        weightForHeightGirls0to2.put(47.5, new double[] {2.2,2.4,2.6,2.9,3.2,3.5,3.8});
        weightForHeightGirls0to2.put(48, new double[] {2.3,2.5,2.7,3,3.3,3.6,4});
        weightForHeightGirls0to2.put(48.5, new double[] {2.4,2.6,2.8,3.1,3.4,3.7,4.1});
        weightForHeightGirls0to2.put(49, new double[] {2.4,2.6,2.9,3.2,3.5,3.8,4.2});
        weightForHeightGirls0to2.put(49.5, new double[] {2.5,2.7,3,3.3,3.6,3.9,4.3});
        weightForHeightGirls0to2.put(50, new double[] {2.6,2.8,3.1,3.4,3.7,4,4.5});
        weightForHeightGirls0to2.put(50.5, new double[] {2.7,2.9,3.2,3.5,3.8,4.2,4.6});
        weightForHeightGirls0to2.put(51, new double[] {2.8,3,3.3,3.6,3.9,4.3,4.8});
        weightForHeightGirls0to2.put(51.5, new double[] {2.8,3.1,3.4,3.7,4,4.4,4.9});
        weightForHeightGirls0to2.put(52, new double[] {2.9,3.2,3.5,3.8,4.2,4.6,5.1});
        weightForHeightGirls0to2.put(52.5, new double[] {3,3.3,3.6,3.9,4.3,4.7,5.2});
        weightForHeightGirls0to2.put(53, new double[] {3.1,3.4,3.7,4,4.4,4.9,5.4});
        weightForHeightGirls0to2.put(53.5, new double[] {3.2,3.5,3.8,4.2,4.6,5,5.5});
        weightForHeightGirls0to2.put(54, new double[] {3.3,3.6,3.9,4.3,4.7,5.2,5.7});
        weightForHeightGirls0to2.put(54.5, new double[] {3.4,3.7,4,4.4,4.8,5.3,5.9});
        weightForHeightGirls0to2.put(55, new double[] {3.5,3.8,4.2,4.5,5,5.5,6.1});
        weightForHeightGirls0to2.put(55.5, new double[] {3.6,3.9,4.3,4.7,5.1,5.7,6.3});
        weightForHeightGirls0to2.put(56, new double[] {3.7,4,4.4,4.8,5.3,5.8,6.4});
        weightForHeightGirls0to2.put(56.5, new double[] {3.8,4.1,4.5,5,5.4,6,6.6});
        weightForHeightGirls0to2.put(57, new double[] {3.9,4.3,4.6,5.1,5.6,6.1,6.8});
        weightForHeightGirls0to2.put(57.5, new double[] {4,4.4,4.8,5.2,5.7,6.3,7});
        weightForHeightGirls0to2.put(58, new double[] {4.1,4.5,4.9,5.4,5.9,6.5,7.1});
        weightForHeightGirls0to2.put(58.5, new double[] {4.2,4.6,5,5.5,6,6.6,7.3});
        weightForHeightGirls0to2.put(59, new double[] {4.3,4.7,5.1,5.6,6.2,6.8,7.5});
        weightForHeightGirls0to2.put(59.5, new double[] {4.4,4.8,5.3,5.7,6.3,6.9,7.7});
        weightForHeightGirls0to2.put(60, new double[] {4.5,4.9,5.4,5.9,6.4,7.1,7.8});
        weightForHeightGirls0to2.put(60.5, new double[] {4.6,5,5.5,6,6.6,7.3,8});
        weightForHeightGirls0to2.put(61, new double[] {4.7,5.1,5.6,6.1,6.7,7.4,8.2});
        weightForHeightGirls0to2.put(61.5, new double[] {4.8,5.2,5.7,6.3,6.9,7.6,8.4});
        weightForHeightGirls0to2.put(62, new double[] {4.9,5.3,5.8,6.4,7,7.7,8.5});
        weightForHeightGirls0to2.put(62.5, new double[] {5,5.4,5.9,6.5,7.1,7.8,8.7});
        weightForHeightGirls0to2.put(63, new double[] {5.1,5.5,6,6.6,7.3,8,8.8});
        weightForHeightGirls0to2.put(63.5, new double[] {5.2,5.6,6.2,6.7,7.4,8.1,9});
        weightForHeightGirls0to2.put(64, new double[] {5.3,5.7,6.3,6.9,7.5,8.3,9.1});
        weightForHeightGirls0to2.put(64.5, new double[] {5.4,5.8,6.4,7,7.6,8.4,9.3});
        weightForHeightGirls0to2.put(65, new double[] {5.5,5.9,6.5,7.1,7.8,8.6,9.5});
        weightForHeightGirls0to2.put(65.5, new double[] {5.5,6,6.6,7.2,7.9,8.7,9.6});
        weightForHeightGirls0to2.put(66, new double[] {5.6,6.1,6.7,7.3,8,8.8,9.8});
        weightForHeightGirls0to2.put(66.5, new double[] {5.7,6.2,6.8,7.4,8.1,9,9.9});
        weightForHeightGirls0to2.put(67, new double[] {5.8,6.3,6.9,7.5,8.3,9.1,10});
        weightForHeightGirls0to2.put(67.5, new double[] {5.9,6.4,7,7.6,8.4,9.2,10.2});
        weightForHeightGirls0to2.put(68, new double[] {6,6.5,7.1,7.7,8.5,9.4,10.3});
        weightForHeightGirls0to2.put(68.5, new double[] {6.1,6.6,7.2,7.9,8.6,9.5,10.5});
        weightForHeightGirls0to2.put(69, new double[] {6.1,6.7,7.3,8,8.7,9.6,10.6});
        weightForHeightGirls0to2.put(69.5, new double[] {6.2,6.8,7.4,8.1,8.8,9.7,10.7});
        weightForHeightGirls0to2.put(70, new double[] {6.3,6.9,7.5,8.2,9,9.9,10.9});
        weightForHeightGirls0to2.put(70.5, new double[] {6.4,6.9,7.6,8.3,9.1,10,11});
        weightForHeightGirls0to2.put(71, new double[] {6.5,7,7.7,8.4,9.2,10.1,11.1});
        weightForHeightGirls0to2.put(71.5, new double[] {6.5,7.1,7.7,8.5,9.3,10.2,11.3});
        weightForHeightGirls0to2.put(72, new double[] {6.6,7.2,7.8,8.6,9.4,10.3,11.4});
        weightForHeightGirls0to2.put(72.5, new double[] {6.7,7.3,7.9,8.7,9.5,10.5,11.5});
        weightForHeightGirls0to2.put(73, new double[] {6.8,7.4,8,8.8,9.6,10.6,11.7});
        weightForHeightGirls0to2.put(73.5, new double[] {6.9,7.4,8.1,8.9,9.7,10.7,11.8});
        weightForHeightGirls0to2.put(74, new double[] {6.9,7.5,8.2,9,9.8,10.8,11.9});
        weightForHeightGirls0to2.put(74.5, new double[] {7,7.6,8.3,9.1,9.9,10.9,12});
        weightForHeightGirls0to2.put(75, new double[] {7.1,7.7,8.4,9.1,10,11,12.2});
        weightForHeightGirls0to2.put(75.5, new double[] {7.1,7.8,8.5,9.2,10.1,11.1,12.3});
        weightForHeightGirls0to2.put(76, new double[] {7.2,7.8,8.5,9.3,10.2,11.2,12.4});
        weightForHeightGirls0to2.put(76.5, new double[] {7.3,7.9,8.6,9.4,10.3,11.4,12.5});
        weightForHeightGirls0to2.put(77, new double[] {7.4,8,8.7,9.5,10.4,11.5,12.6});
        weightForHeightGirls0to2.put(77.5, new double[] {7.4,8.1,8.8,9.6,10.5,11.6,12.8});
        weightForHeightGirls0to2.put(78, new double[] {7.5,8.2,8.9,9.7,10.6,11.7,12.9});
        weightForHeightGirls0to2.put(78.5, new double[] {7.6,8.2,9,9.8,10.7,11.8,13});
        weightForHeightGirls0to2.put(79, new double[] {7.7,8.3,9.1,9.9,10.8,11.9,13.1});
        weightForHeightGirls0to2.put(79.5, new double[] {7.7,8.4,9.1,10,10.9,12,13.3});
        weightForHeightGirls0to2.put(80, new double[] {7.8,8.5,9.2,10.1,11,12.1,13.4});
        weightForHeightGirls0to2.put(80.5, new double[] {7.9,8.6,9.3,10.2,11.2,12.3,13.5});
        weightForHeightGirls0to2.put(93, new double[] {10.2,11.1,12.1,13.2,14.5,15.9,17.5});
        weightForHeightGirls0to2.put(93.5, new double[] {10.3,11.2,12.2,13.3,14.6,16.1,17.7});
        weightForHeightGirls0to2.put(94, new double[] {10.4,11.3,12.3,13.5,14.7,16.2,17.9});
        weightForHeightGirls0to2.put(94.5, new double[] {10.5,11.4,12.4,13.6,14.9,16.4,18});
        weightForHeightGirls0to2.put(95, new double[] {10.6,11.5,12.6,13.7,15,16.5,18.2});
        weightForHeightGirls0to2.put(95.5, new double[] {10.7,11.6,12.7,13.8,15.2,16.7,18.4});
        weightForHeightGirls0to2.put(96, new double[] {10.8,11.7,12.8,14,15.3,16.8,18.6});
        weightForHeightGirls0to2.put(96.5, new double[] {10.9,11.8,12.9,14.1,15.4,17,18.7});
        weightForHeightGirls0to2.put(97, new double[] {11,12,13,14.2,15.6,17.1,18.9});
        weightForHeightGirls0to2.put(97.5, new double[] {11.1,12.1,13.1,14.4,15.7,17.3,19.1});
        weightForHeightGirls0to2.put(98, new double[] {11.2,12.2,13.3,14.5,15.9,17.5,19.3});
        weightForHeightGirls0to2.put(98.5, new double[] {11.3,12.3,13.4,14.6,16,17.6,19.5});
        weightForHeightGirls0to2.put(99, new double[] {11.4,12.4,13.5,14.8,16.2,17.8,19.6});
        weightForHeightGirls0to2.put(99.5, new double[] {11.5,12.5,13.6,14.9,16.3,18,19.8});
        weightForHeightGirls0to2.put(100, new double[] {11.6,12.6,13.7,15,16.5,18.1,20});
        weightForHeightGirls0to2.put(100.5, new double[] {11.7,12.7,13.9,15.2,16.6,18.3,20.2});
        weightForHeightGirls0to2.put(101, new double[] {11.8,12.8,14,15.3,16.8,18.5,20.4});
        weightForHeightGirls0to2.put(101.5, new double[] {11.9,13,14.1,15.5,17,18.7,20.6});
        weightForHeightGirls0to2.put(102, new double[] {12,13.1,14.3,15.6,17.1,18.9,20.8});
        weightForHeightGirls0to2.put(102.5, new double[] {12.1,13.2,14.4,15.8,17.3,19,21});
        weightForHeightGirls0to2.put(103, new double[] {12.3,13.3,14.5,15.9,17.5,19.2,21.3});
        weightForHeightGirls0to2.put(103.5, new double[] {12.4,13.5,14.7,16.1,17.6,19.4,21.5});
        weightForHeightGirls0to2.put(104, new double[] {12.5,13.6,14.8,16.2,17.8,19.6,21.7});
        weightForHeightGirls0to2.put(104.5, new double[] {12.6,13.7,15,16.4,18,19.8,21.9});
        weightForHeightGirls0to2.put(105, new double[] {12.7,13.8,15.1,16.5,18.2,20,22.2});
        weightForHeightGirls0to2.put(105.5, new double[] {12.8,14,15.3,16.7,18.4,20.2,22.4});
        weightForHeightGirls0to2.put(106, new double[] {13,14.1,15.4,16.9,18.5,20.5,22.6});
        weightForHeightGirls0to2.put(106.5, new double[] {13.1,14.3,15.6,17.1,18.7,20.7,22.9});
        weightForHeightGirls0to2.put(107, new double[] {13.2,14.4,15.7,17.2,18.9,20.9,23.1});
        weightForHeightGirls0to2.put(107.5, new double[] {13.3,14.5,15.9,17.4,19.1,21.1,23.4});
        weightForHeightGirls0to2.put(108, new double[] {13.5,14.7,16,17.6,19.3,21.3,23.6});
        weightForHeightGirls0to2.put(108.5, new double[] {13.6,14.8,16.2,17.8,19.5,21.6,23.9});
        weightForHeightGirls0to2.put(109, new double[] {13.7,15,16.4,18,19.7,21.8,24.2});
        weightForHeightGirls0to2.put(109.5, new double[] {13.9,15.1,16.5,18.1,20,22,24.4});
        weightForHeightGirls0to2.put(110, new double[] {14,15.3,16.7,18.3,20.2,22.3,24.7});
    }

    public LineGraphSeries<DataPoint> weightForHeightGirls0to2(int pos, int maxMonth) {
        LineGraphSeries<DataPoint> weightForHeightGirls0to2_series = new LineGraphSeries<DataPoint>();
        for (int i = 0; i <= maxMonth; i++) {
            weightForHeightGirls0to2_series.appendData(
                    new DataPoint(i, weightForHeightGirls0to2.get(i)[pos]), true, 60);
        }

        weightForHeightGirls0to2_series.setColor(getColor(pos));
        weightForHeightGirls0to2_series.setThickness(1);
        weightForHeightGirls0to2_series.setBackgroundColor(getColor(pos));
        weightForHeightGirls0to2_series.setDrawBackground(true);
        return weightForHeightGirls0to2_series;
    }


        public void initializweightForHeightGirls2to5() {

        weightForHeightGirls2to5.put(65, new double[] {5.6,6.1,6.6,7.2,7.9,8.7,9.7});
        weightForHeightGirls2to5.put(65.5, new double[] {5.7,6.2,6.7,7.4,8.1,8.9,9.8});
        weightForHeightGirls2to5.put(66, new double[] {5.8,6.3,6.8,7.5,8.2,9,10});
        weightForHeightGirls2to5.put(66.5, new double[] {5.8,6.4,6.9,7.6,8.3,9.1,10.1});
        weightForHeightGirls2to5.put(67, new double[] {5.9,6.4,7,7.7,8.4,9.3,10.2});
        weightForHeightGirls2to5.put(67.5, new double[] {6,6.5,7.1,7.8,8.5,9.4,10.4});
        weightForHeightGirls2to5.put(68, new double[] {6.1,6.6,7.2,7.9,8.7,9.5,10.5});
        weightForHeightGirls2to5.put(68.5, new double[] {6.2,6.7,7.3,8,8.8,9.7,10.7});
        weightForHeightGirls2to5.put(69, new double[] {6.3,6.8,7.4,8.1,8.9,9.8,10.8});
        weightForHeightGirls2to5.put(69.5, new double[] {6.3,6.9,7.5,8.2,9,9.9,10.9});
        weightForHeightGirls2to5.put(70, new double[] {6.4,7,7.6,8.3,9.1,10,11.1});
        weightForHeightGirls2to5.put(70.5, new double[] {6.5,7.1,7.7,8.4,9.2,10.1,11.2});
        weightForHeightGirls2to5.put(71, new double[] {6.6,7.1,7.8,8.5,9.3,10.3,11.3});
        weightForHeightGirls2to5.put(71.5, new double[] {6.7,7.2,7.9,8.6,9.4,10.4,11.5});
        weightForHeightGirls2to5.put(72, new double[] {6.7,7.3,8,8.7,9.5,10.5,11.6});
        weightForHeightGirls2to5.put(72.5, new double[] {6.8,7.4,8.1,8.8,9.7,10.6,11.7});
        weightForHeightGirls2to5.put(73, new double[] {6.9,7.5,8.1,8.9,9.8,10.7,11.8});
        weightForHeightGirls2to5.put(73.5, new double[] {7,7.6,8.2,9,9.9,10.8,12});
        weightForHeightGirls2to5.put(74, new double[] {7,7.6,8.3,9.1,10,11,12.1});
        weightForHeightGirls2to5.put(74.5, new double[] {7.1,7.7,8.4,9.2,10.1,11.1,12.2});
        weightForHeightGirls2to5.put(75, new double[] {7.2,7.8,8.5,9.3,10.2,11.2,12.3});
        weightForHeightGirls2to5.put(75.5, new double[] {7.2,7.9,8.6,9.4,10.3,11.3,12.5});
        weightForHeightGirls2to5.put(76, new double[] {7.3,8,8.7,9.5,10.4,11.4,12.6});
        weightForHeightGirls2to5.put(76.5, new double[] {7.4,8,8.7,9.6,10.5,11.5,12.7});
        weightForHeightGirls2to5.put(77, new double[] {7.5,8.1,8.8,9.6,10.6,11.6,12.8});
        weightForHeightGirls2to5.put(77.5, new double[] {7.5,8.2,8.9,9.7,10.7,11.7,12.9});
        weightForHeightGirls2to5.put(78, new double[] {7.6,8.3,9,9.8,10.8,11.8,13.1});
        weightForHeightGirls2to5.put(78.5, new double[] {7.7,8.4,9.1,9.9,10.9,12,13.2});
        weightForHeightGirls2to5.put(79, new double[] {7.8,8.4,9.2,10,11,12.1,13.3});
        weightForHeightGirls2to5.put(79.5, new double[] {7.8,8.5,9.3,10.1,11.1,12.2,13.4});
        weightForHeightGirls2to5.put(80, new double[] {7.9,8.6,9.4,10.2,11.2,12.3,13.6});
        weightForHeightGirls2to5.put(80.5, new double[] {8,8.7,9.5,10.3,11.3,12.4,13.7});
        weightForHeightGirls2to5.put(81, new double[] {8.1,8.8,9.6,10.4,11.4,12.6,13.9});
        weightForHeightGirls2to5.put(81.5, new double[] {8.2,8.9,9.7,10.6,11.6,12.7,14});
        weightForHeightGirls2to5.put(82, new double[] {8.3,9,9.8,10.7,11.7,12.8,14.1});
        weightForHeightGirls2to5.put(82.5, new double[] {8.4,9.1,9.9,10.8,11.8,13,14.3});
        weightForHeightGirls2to5.put(83, new double[] {8.5,9.2,10,10.9,11.9,13.1,14.5});
        weightForHeightGirls2to5.put(83.5, new double[] {8.5,9.3,10.1,11,12.1,13.3,14.6});
        weightForHeightGirls2to5.put(84, new double[] {8.6,9.4,10.2,11.1,12.2,13.4,14.8});
        weightForHeightGirls2to5.put(84.5, new double[] {8.7,9.5,10.3,11.3,12.3,13.5,14.9});
        weightForHeightGirls2to5.put(85, new double[] {8.8,9.6,10.4,11.4,12.5,13.7,15.1});
        weightForHeightGirls2to5.put(85.5, new double[] {8.9,9.7,10.6,11.5,12.6,13.8,15.3});
        weightForHeightGirls2to5.put(86, new double[] {9,9.8,10.7,11.6,12.7,14,15.4});
        weightForHeightGirls2to5.put(86.5, new double[] {9.1,9.9,10.8,11.8,12.9,14.2,15.6});
        weightForHeightGirls2to5.put(87, new double[] {9.2,10,10.9,11.9,13,14.3,15.8});
        weightForHeightGirls2to5.put(87.5, new double[] {9.3,10.1,11,12,13.2,14.5,15.9});
        weightForHeightGirls2to5.put(88, new double[] {9.4,10.2,11.1,12.1,13.3,14.6,16.1});
        weightForHeightGirls2to5.put(88.5, new double[] {9.5,10.3,11.2,12.3,13.4,14.8,16.3});
        weightForHeightGirls2to5.put(89, new double[] {9.6,10.4,11.4,12.4,13.6,14.9,16.4});
        weightForHeightGirls2to5.put(89.5, new double[] {9.7,10.5,11.5,12.5,13.7,15.1,16.6});
        weightForHeightGirls2to5.put(90, new double[] {9.8,10.6,11.6,12.6,13.8,15.2,16.8});
        weightForHeightGirls2to5.put(90.5, new double[] {9.9,10.7,11.7,12.8,14,15.4,16.9});
        weightForHeightGirls2to5.put(91, new double[] {10,10.9,11.8,12.9,14.1,15.5,17.1});
        weightForHeightGirls2to5.put(91.5, new double[] {10.1,11,11.9,13,14.3,15.7,17.3});
        weightForHeightGirls2to5.put(92, new double[] {10.2,11.1,12,13.1,14.4,15.8,17.4});
        weightForHeightGirls2to5.put(92.5, new double[] {10.3,11.2,12.1,13.3,14.5,16,17.6});
        weightForHeightGirls2to5.put(93, new double[] {10.4,11.3,12.3,13.4,14.7,16.1,17.8});
        weightForHeightGirls2to5.put(93.5, new double[] {10.5,11.4,12.4,13.5,14.8,16.3,17.9});
        weightForHeightGirls2to5.put(94, new double[] {10.6,11.5,12.5,13.6,14.9,16.4,18.1});
        weightForHeightGirls2to5.put(94.5, new double[] {10.7,11.6,12.6,13.8,15.1,16.6,18.3});
        weightForHeightGirls2to5.put(95, new double[] {10.8,11.7,12.7,13.9,15.2,16.7,18.5});
        weightForHeightGirls2to5.put(95.5, new double[] {10.8,11.8,12.8,14,15.4,16.9,18.6});
        weightForHeightGirls2to5.put(96, new double[] {10.9,11.9,12.9,14.1,15.5,17,18.8});
        weightForHeightGirls2to5.put(96.5, new double[] {11,12,13.1,14.3,15.6,17.2,19});
        weightForHeightGirls2to5.put(97, new double[] {11.1,12.1,13.2,14.4,15.8,17.4,19.2});
        weightForHeightGirls2to5.put(97.5, new double[] {11.2,12.2,13.3,14.5,15.9,17.5,19.3});
        weightForHeightGirls2to5.put(98, new double[] {11.3,12.3,13.4,14.7,16.1,17.7,19.5});
        weightForHeightGirls2to5.put(98.5, new double[] {11.4,12.4,13.5,14.8,16.2,17.9,19.7});
        weightForHeightGirls2to5.put(99, new double[] {11.5,12.5,13.7,14.9,16.4,18,19.9});
        weightForHeightGirls2to5.put(99.5, new double[] {11.6,12.7,13.8,15.1,16.5,18.2,20.1});
        weightForHeightGirls2to5.put(100, new double[] {11.7,12.8,13.9,15.2,16.7,18.4,20.3});
        weightForHeightGirls2to5.put(100.5, new double[] {11.9,12.9,14.1,15.4,16.9,18.6,20.5});
        weightForHeightGirls2to5.put(101, new double[] {12,13,14.2,15.5,17,18.7,20.7});
        weightForHeightGirls2to5.put(101.5, new double[] {12.1,13.1,14.3,15.7,17.2,18.9,20.9});
        weightForHeightGirls2to5.put(102, new double[] {12.2,13.3,14.5,15.8,17.4,19.1,21.1});
        weightForHeightGirls2to5.put(102.5, new double[] {12.3,13.4,14.6,16,17.5,19.3,21.4});
        weightForHeightGirls2to5.put(103, new double[] {12.4,13.5,14.7,16.1,17.7,19.5,21.6});
        weightForHeightGirls2to5.put(103.5, new double[] {12.5,13.6,14.9,16.3,17.9,19.7,21.8});
        weightForHeightGirls2to5.put(104, new double[] {12.6,13.8,15,16.4,18.1,19.9,22});
        weightForHeightGirls2to5.put(104.5, new double[] {12.8,13.9,15.2,16.6,18.2,20.1,22.3});
        weightForHeightGirls2to5.put(105, new double[] {12.9,14,15.3,16.8,18.4,20.3,22.5});
        weightForHeightGirls2to5.put(105.5, new double[] {13,14.2,15.5,16.9,18.6,20.5,22.7});
        weightForHeightGirls2to5.put(106, new double[] {13.1,14.3,15.6,17.1,18.8,20.8,23});
        weightForHeightGirls2to5.put(106.5, new double[] {13.3,14.5,15.8,17.3,19,21,23.2});
        weightForHeightGirls2to5.put(107, new double[] {13.4,14.6,15.9,17.5,19.2,21.2,23.5});
        weightForHeightGirls2to5.put(107.5, new double[] {13.5,14.7,16.1,17.7,19.4,21.4,23.7});
        weightForHeightGirls2to5.put(108, new double[] {13.7,14.9,16.3,17.8,19.6,21.7,24});
        weightForHeightGirls2to5.put(108.5, new double[] {13.8,15,16.4,18,19.8,21.9,24.3});
        weightForHeightGirls2to5.put(109, new double[] {13.9,15.2,16.6,18.2,20,22.1,24.5});
        weightForHeightGirls2to5.put(109.5, new double[] {14.1,15.4,16.8,18.4,20.3,22.4,24.8});
        weightForHeightGirls2to5.put(110, new double[] {14.2,15.5,17,18.6,20.5,22.6,25.1});
        weightForHeightGirls2to5.put(110.5, new double[] {14.4,15.7,17.1,18.8,20.7,22.9,25.4});
        weightForHeightGirls2to5.put(111, new double[] {14.5,15.8,17.3,19,20.9,23.1,25.7});
        weightForHeightGirls2to5.put(111.5, new double[] {14.7,16,17.5,19.2,21.2,23.4,26});
        weightForHeightGirls2to5.put(112, new double[] {14.8,16.2,17.7,19.4,21.4,23.6,26.2});
        weightForHeightGirls2to5.put(112.5, new double[] {15,16.3,17.9,19.6,21.6,23.9,26.5});
        weightForHeightGirls2to5.put(113, new double[] {15.1,16.5,18,19.8,21.8,24.2,26.8});
        weightForHeightGirls2to5.put(113.5, new double[] {15.3,16.7,18.2,20,22.1,24.4,27.1});
        weightForHeightGirls2to5.put(114, new double[] {15.4,16.8,18.4,20.2,22.3,24.7,27.4});
        weightForHeightGirls2to5.put(114.5, new double[] {15.6,17,18.6,20.5,22.6,25,27.8});
        weightForHeightGirls2to5.put(115, new double[] {15.7,17.2,18.8,20.7,22.8,25.2,28.1});
        weightForHeightGirls2to5.put(115.5, new double[] {15.9,17.3,19,20.9,23,25.5,28.4});
        weightForHeightGirls2to5.put(116, new double[] {16,17.5,19.2,21.1,23.3,25.8,28.7});
        weightForHeightGirls2to5.put(116.5, new double[] {16.2,17.7,19.4,21.3,23.5,26.1,29});
        weightForHeightGirls2to5.put(117, new double[] {16.3,17.8,19.6,21.5,23.8,26.3,29.3});
        weightForHeightGirls2to5.put(117.5, new double[] {16.5,18,19.8,21.7,24,26.6,29.6});
        weightForHeightGirls2to5.put(118, new double[] {16.6,18.2,19.9,22,24.2,26.9,29.9});
        weightForHeightGirls2to5.put(118.5, new double[] {16.8,18.4,20.1,22.2,24.5,27.2,30.3});
        weightForHeightGirls2to5.put(119, new double[] {16.9,18.5,20.3,22.4,24.7,27.4,30.6});
        weightForHeightGirls2to5.put(119.5, new double[] {17.1,18.7,20.5,22.6,25,27.7,30.9});
        weightForHeightGirls2to5.put(120, new double[] {17.3,18.9,20.7,22.8,25.2,28,31.2});
    }

    public LineGraphSeries<DataPoint> weightForHeightGirls2to5(int pos, int maxMonth) {
        LineGraphSeries<DataPoint> weightForHeightGirls2to5_series = new LineGraphSeries<DataPoint>();
        for (int i = 0; i <= maxMonth; i++) {
            weightForHeightGirls2to5_series.appendData(
                    new DataPoint(i, weightForHeightGirls2to5.get(i)[pos]), true, 60);
        }

        weightForHeightGirls2to5_series.setColor(getColor(pos));
        weightForHeightGirls2to5_series.setThickness(1);
        weightForHeightGirls2to5_series.setBackgroundColor(getColor(pos));
        weightForHeightGirls2to5_series.setDrawBackground(true);
        return weightForHeightGirls2to5_series;
    }


    public Map<Integer, double[]> getHeightForAgeGirls() {
        return heightForAgeGirls;
    }

    public Map<Integer, double[]> getHeightForAgeBoys() {
        return heightForAgeBoys;
    }

    public Map<Integer, double[]> getWeightForAgeGirls() {
        return weightForAgeGirls;
    }

    public Map<Integer, double[]> getWeightForAgeBoys() {
        return weightForAgeBoys;
    }

    //weight for height

    public Map<Number, double[]> getWeightForHeightBoys0to2() {
        return weightForHeightBoys0to2;
    }

    public Map<Number, double[]> getWeightForHeightBoys2to5() {
        return weightForHeightBoys2to5;
    }

    public Map<Number, double[]> getWeightForHeightGirls0to2 () {
        return weightForHeightGirls0to2;
    }

    public Map<Number, double[]> getWeightForHeightGirls2to5 () {
        return weightForHeightGirls2to5;
    }

    private int getColor(int pos) {
        int color = Color.RED;

        switch (pos) {
            case 0:
            case 6:
                color = Color.RED;
                break;
            case 1:
            case 5:
                color = Color.rgb(255, 165, 0);
                break;
            case 2:
            case 4:
                color = Color.YELLOW;
                break;
            case 3:
                color = Color.GREEN;
                break;
        }

         /*
        switch (pos) {
            case 0:
                color = Color.RED;
                break;
            case 1:
                color = Color.rgb(255, 165, 0);
                break;
            case 2:
                color = Color.YELLOW;
                break;
            case 3:
                color = Color.GREEN;
                break;
        }

         */

        return color;
    }

}