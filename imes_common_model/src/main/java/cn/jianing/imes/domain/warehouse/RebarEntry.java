package cn.jianing.imes.domain.warehouse;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Data
@Table(name = "wh_rebar_entry")
public class RebarEntry {

    @Id
    private String id;
    private String warehouseEntryId;
    private Integer rebarCategory;   //钢筋种类，0=棒材， 1=线材
    private String manufacturer;
    private String specification;
    private Integer diameter;
    private Integer length;
    private Integer quantity;
    private String quantityUnit = "捆";
    private Integer packageQuantity;
    private String packageQuantityUnit = "根";
    private Double theoreticalWeight;
    private Double actualWeight;
    private String batchNumber;
    private String usagePosition;
    private String driver;
    private String vehicle;
    private String remarks;
    private Boolean isDeleted;
    @Transient
    private String experimentCode;
}
