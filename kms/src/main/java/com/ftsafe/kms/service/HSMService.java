/**
* @FileName HSMService.java
* <p>
* @Date 2016年6月22日
* <p>
* 本源码采用Apache许可协议，
* 如有疑问请电邮 qingyuan.ke@foxmail.com。
*/

package com.ftsafe.kms.service;

import com.ftsafe.kms.pojo.KYHSMKey;
import com.ftsafe.kms.pojo.WSTHSMKey;

/**
 * <p>
 * 
 * @className HSMService.java
 * @classDescription
 *                   <p>
 * @createTime 2016年6月22日
 * @author Qingyuan
 */

public interface HSMService {

	/**
	 * 
	 *<p>
	 * 功能描述 保存密钥（金卡体系）
	 *</p>
	 * @return {@code String}
	 */
	public String saveKeyToKingArchitecture();
	/**
	 * 
	 *<p>
	 * 功能描述 删除密钥（金卡体系）
	 *</p>
	 * @return {@code String}
	 */
	public String removeKeyFromKingArchitecture();
	/**
	 * 
	 *<p>
	 * 功能描述 保存主密钥（金卡体系）
	 *</p>
	 * @return {@code String}
	 */
	public String saveMasterKeyToKingArchitecture();
	/**
	 * 
	 *<p>
	 * 功能描述 保存传输密钥（金卡体系）
	 *</p>
	 * @return {@code String}
	 */
	public String saveTransportKeyToKingArchitecture();
	/**
	 * 
	 *<p>
	 * 功能描述 获取密钥（金卡体系）
	 *</p>
	 * @return {@code WSTHSMKey}
	 */
	public WSTHSMKey retrieveKeyFromKingArchitecture(String id);
	/**
	 * 
	 *<p>
	 * 功能描述 保存密钥（Racal体系）
	 *</p>
	 * @return {@code String}
	 */
	public String saveKeyToRacalArchitecture();
	/**
	 * 
	 *<p>
	 * 功能描述 删除密钥（Racal体系）
	 *</p>
	 * @return {@code String}
	 */
	public String removeKeyFromRacalArchitecture();
	/**
	 * 
	 *<p>
	 * 功能描述 保存区域主密钥（Racal体系）
	 *</p>
	 * @return {@code String}
	 */
	public String saveZoneMasterKeyToRacalArchiteture();
	/** 
	 * 
	 *<p>
	 * 功能描述 获取密钥（Racal体系）
	 *</p>
	 * @return {@code KYHSMKey}
	 */
	public KYHSMKey retrieveKeyFromRacalArchiteture();
}
