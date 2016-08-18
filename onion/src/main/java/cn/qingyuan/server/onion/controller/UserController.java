/**
* <p>
* @className:UserController.java
* @classDescription:
* <p>
* @createTime：2016年8月18日
* @author：Qingyuan
*/

package cn.qingyuan.server.onion.controller;

import javax.inject.Inject;

import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import cn.qingyuan.server.onion.model.User;
import cn.qingyuan.server.onion.service.UserService;

/**
 * <p>
 * 
 * @className:UserController.java
 * @classDescription:
 *                    <p>
 * @createTime:2016年8月18日
 * @author:Qingyuan
 */

@Controller
@RequestMapping("/users/{uid}")
public class UserController {

	@Inject
	private UserService userService;

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody User add(@PathVariable long uid, @RequestBody User user) {
		user.setUid(uid);
		return userService.add(user);
	}

	@RequestMapping(value = "/{mid}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody User get(@PathVariable long uid, @PathVariable long mid) {
		return userService.getUser(uid, mid);
	}

	@RequestMapping(value = "/{mid}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable long uid, @PathVariable long mid) {
		userService.deleteAllByUidAndMid(uid, mid);
	}

	@RequestMapping(value = "/{mid}/gender", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody int queryGenderByUid(@PathVariable long uid, @PathVariable long mid) {
		return userService.queryGenderByUid(uid, mid);
	}
}
