package team.gpt.pecare.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import team.gpt.pecare.model.domain.Pet;
import team.gpt.pecare.mapper.PetMapper;
import org.springframework.stereotype.Service;
import team.gpt.pecare.service.PetService;

/**
* @author Administrator
* @description 针对表【pet(pet_table)】的数据库操作Service实现
* @createDate 2024-04-05 00:18:54
*/
@Service
public class PetServiceImpl extends ServiceImpl<PetMapper, Pet>
    implements PetService {

}




