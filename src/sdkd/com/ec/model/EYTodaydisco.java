package sdkd.com.ec.model;

/**
 * Created by ydf_m on 2016/7/6.
 */
public class EYTodaydisco {
    private int ep_id;
    private String ep_name;
    private String description;
    private double ep_price;
    private int ep_stock;
    private int epc_id;
    private int epc_child_id;
    private String ecp_file_name;

    public void setEp_id(int ep_id) {
        this.ep_id = ep_id;
    }

    public void setEp_name(String ep_name) {
        this.ep_name = ep_name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEp_price(double ep_price) {
        this.ep_price = ep_price;
    }

    public void setEp_stock(int ep_stock) {
        this.ep_stock = ep_stock;
    }

    public void setEpc_id(int epc_id) {
        this.epc_id = epc_id;
    }

    public void setEpc_child_id(int epc_child_id) {
        this.epc_child_id = epc_child_id;
    }

    public void setEcp_file_name(String ecp_file_name) {
        this.ecp_file_name = ecp_file_name;
    }

    public int getEp_id() {
        return ep_id;
    }

    public String getEp_name() {
        return ep_name;
    }

    public String getDescription() {
        return description;
    }

    public double getEp_price() {
        return ep_price;
    }

    public int getEp_stock() {
        return ep_stock;
    }

    public int getEpc_id() {
        return epc_id;
    }

    public int getEpc_child_id() {
        return epc_child_id;
    }

    public String getEcp_file_name() {
        return ecp_file_name;
    }
}
