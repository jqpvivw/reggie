package com.jqpv.reggie.dto;


import com.jqpv.reggie.entity.Setmeal;
import com.jqpv.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
