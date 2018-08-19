@RestController
@RequestMapping()
public class UserController{
	
	@AutoWired
	private UserService userService;

	@GetMapping
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
}