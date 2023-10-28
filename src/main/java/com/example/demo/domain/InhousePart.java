package com.example.demo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 *
 *
 *
 */
@Entity
@DiscriminatorValue("1")
public class InhousePart extends Part{
    int partId;

    public InhousePart() {
    }

    public int getPartId() {
        return partId;
    }

    @Override
    public boolean isInvValid() {
        return (this.getInv() >= this.getMin() && this.getInv() <= this.getMax());
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }
}
