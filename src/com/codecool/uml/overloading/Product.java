package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Product {

    private int id;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;
    private static List<Product> productList = new ArrayList<>();

    public Product() {
        productList.add(this);
        id = productList.size();
    }

    public Product(String name, float defaultPrice, Currency defaultCurrency) {
        productList.add(this);
        id = productList.size();
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<Product> getAllProductsBy(ProductCategory productCategory) {
        List<Product> filterResult = new ArrayList<>();
        for (Product product :
                productList) {
            if (product.productCategory.equals(productCategory)) {
                filterResult.add(product);
            }
        }
        return filterResult;
    }

    public List<Product> getAllProductsBy(Supplier supplier) {
        List<Product> filterResult = new ArrayList<>();
        for (Product product :
                productList) {
            if (product.supplier.equals(supplier)) {
                filterResult.add(product);
            }
        }
        return filterResult;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("id=").append(id);
        sb.append(",name=").append(name);
        sb.append(",defaultPrice=").append(defaultPrice);
        sb.append(",defaultCurrency=").append(defaultCurrency);
        sb.append(",productCategory=").append(productCategory);
        sb.append(",supplier=").append(supplier);
        return sb.toString();
    }
}
