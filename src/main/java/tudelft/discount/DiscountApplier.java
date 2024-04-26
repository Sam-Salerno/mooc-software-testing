package tudelft.discount;

public class DiscountApplier {

    private ProductDao dao;

    public DiscountApplier (ProductDao dao) {
        this.dao = dao;
    }

    public void setNewPrices() {

        for(Product product : dao.all()) {
            if("BUSINESS".equals(product.getCategory())) {
                product.setPrice(product.getPrice() * 0.9);
            }
            if("HOME".equals(product.getCategory())) {
                product.setPrice(product.getPrice() * 1.1);
            }
        }

    }
}
