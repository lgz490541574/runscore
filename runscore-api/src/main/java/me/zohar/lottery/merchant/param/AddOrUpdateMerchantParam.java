package me.zohar.lottery.merchant.param;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import org.springframework.beans.BeanUtils;

import lombok.Data;
import me.zohar.lottery.common.utils.IdUtils;
import me.zohar.lottery.merchant.domain.Merchant;

@Data
public class AddOrUpdateMerchantParam {

	private String id;
	
	@NotBlank
	private String merchantNum;

	@NotBlank
	private String name;

	@NotBlank
	private String secretKey;
	
	@NotBlank
	private String relevanceAccountUserName;

	public Merchant convertToPo() {
		Merchant po = new Merchant();
		BeanUtils.copyProperties(this, po);
		po.setId(IdUtils.getId());
		po.setCreateTime(new Date());
		return po;
	}

}
